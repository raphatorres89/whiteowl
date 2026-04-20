package com.raphaowl.whiteowl.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Getter;

@Getter
@ResponseStatus(HttpStatus.NOT_FOUND)
public class RaceNotFoundException extends RuntimeException {

    private final String slug;

    public RaceNotFoundException(String slug) {
        super("Raça com Slug '%s' não encontrada".formatted(slug));
        this.slug = slug;
    }
}
