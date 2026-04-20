package com.raphaowl.whiteowl.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Getter;

@Getter
@ResponseStatus(HttpStatus.NOT_FOUND)
public class MonsterNotFoundException extends RuntimeException {

    private final String slug;

    public MonsterNotFoundException(String slug) {
        super("Monstro com Slug '%s' não encontrado".formatted(slug));
        this.slug = slug;
    }

}