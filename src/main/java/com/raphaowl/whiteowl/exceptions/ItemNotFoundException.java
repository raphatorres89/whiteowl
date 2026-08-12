package com.raphaowl.whiteowl.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Getter;

@Getter
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ItemNotFoundException extends RuntimeException {

    private final String slug;

    public ItemNotFoundException(String slug) {
        super("Item com Slug '%s' não encontrado".formatted(slug));
        this.slug = slug;
    }

}