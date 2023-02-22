package com.melihcan.legendarysquad.exception;

import lombok.Getter;

@Getter
public class LegendarySquadException extends RuntimeException{

    private final ErrorType errorType;


    /**
     * Runtime dan miras aldığımız için hata mesajının kendısıne ıletılmesı gereklıdır.
     * @param errorType
     */
    public LegendarySquadException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public LegendarySquadException(ErrorType errorType, String message){
        super(message);
        this.errorType = errorType;
    }
}
