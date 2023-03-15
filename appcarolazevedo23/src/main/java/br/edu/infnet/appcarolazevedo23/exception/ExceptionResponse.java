package br.edu.infnet.appcarolazevedo23.exception;

import java.io.Serializable;
import java.time.LocalDate;

public class ExceptionResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private LocalDate timestamp;
    private String message;
    private String details;

    public ExceptionResponse(LocalDate timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
