package com.felipe.bffagendadortarefas.controller;


import com.felipe.bffagendadortarefas.infrastructure.exceptions.ConflitExceptions;
import com.felipe.bffagendadortarefas.infrastructure.exceptions.ResourceNotFoundException;
import com.felipe.bffagendadortarefas.infrastructure.exceptions.UnauthorizedException;
import com.felipe.bffagendadortarefas.infrastructure.exceptions.IllegalArgumentException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleResourceNotFoundException(ResourceNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ConflitExceptions.class)
    public ResponseEntity<String> handleConflitException(ConflitExceptions ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<String> unauthorizedException(UnauthorizedException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> Illegal(IllegalArgumentException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
