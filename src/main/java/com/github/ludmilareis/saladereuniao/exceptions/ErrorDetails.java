package com.github.ludmilareis.saladereuniao.exceptions;

import lombok.Getter;

import java.util.Date;
@Getter

public class ErrorDetails {
    private Date timesTamp;
    private String message;
    private String details;

    public ErrorDetails(Date timesTamp, String message, String details) {
        super();
        this.timesTamp = timesTamp;
        this.message = message;
        this.details = details;
    }
}
