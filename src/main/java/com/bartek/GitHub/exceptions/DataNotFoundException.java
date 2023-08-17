package com.bartek.GitHub.exceptions;

import org.springframework.http.HttpStatus;

public class DataNotFoundException extends GithubException {
    public DataNotFoundException(String message){
        super(message, HttpStatus.NOT_FOUND);
    }
}
