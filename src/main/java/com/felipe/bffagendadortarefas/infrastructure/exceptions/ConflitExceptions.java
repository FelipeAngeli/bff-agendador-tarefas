package com.felipe.bffagendadortarefas.infrastructure.exceptions;

public class ConflitExceptions extends RuntimeException{

    public ConflitExceptions(String mensagem){
        super(mensagem);
    }

    public ConflitExceptions(String mensagem, Throwable throwable){
        super(mensagem);
    }
}
