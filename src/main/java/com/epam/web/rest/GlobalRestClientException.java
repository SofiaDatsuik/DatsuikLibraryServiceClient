package com.epam.web.rest;

public class GlobalRestClientException extends Exception {

    public GlobalRestClientException() {
    }

    public GlobalRestClientException(String message) {
        super(message);
    }

    public GlobalRestClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public GlobalRestClientException(Throwable cause) {
        super(cause);
    }

    public GlobalRestClientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
