package br.edu.infnet.appcarolazevedo23.controller;

import br.edu.infnet.appcarolazevedo23.model.Usuario;
import br.edu.infnet.appcarolazevedo23.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;


@Controller
@SessionAttributes("user")
public class AppController {

	@Autowired 
	private UsuarioService usuarioService;

	@RequestMapping(value = "/api/", method = RequestMethod.GET)
	public String showInit() {
		return "login";
	}

	@RequestMapping(value = "/api/login", method = RequestMethod.GET)
	public String showLogin() {
		return this.showInit();
	}
	
	@RequestMapping(value = "/api/login", method = RequestMethod.POST)
	public String showHome(
				Model model,
				@RequestParam String login,
				@RequestParam String senha
			) {

		Usuario usuario = usuarioService.isValid(login, senha);
		
		if(usuario == null) {
			model.addAttribute("mensagem", "Credenciais inválidas: " + login);
			return "login";
		} else {
			model.addAttribute("user", usuario);
			return "home";
		}		
	}

	@RequestMapping(value = "/api/voltar", method = RequestMethod.GET)
	public String voltar() {		
		return "home";
	}
	
	@RequestMapping(value = "/api/sair", method = RequestMethod.GET)
	public String sair(SessionStatus session) {
		
		session.setComplete();
		
		return "login";
	}
}
