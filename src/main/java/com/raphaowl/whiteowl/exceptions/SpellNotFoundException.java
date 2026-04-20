package com.raphaowl.whiteowl.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Getter;

@Getter
@ResponseStatus(HttpStatus.NOT_FOUND)
public class SpellNotFoundException extends RuntimeException {

    private final String slug;

    public SpellNotFoundException(String slug) {
        super("Magia com Slug '%s' não encontrada".formatted(slug));
        this.slug = slug;
    }
}
