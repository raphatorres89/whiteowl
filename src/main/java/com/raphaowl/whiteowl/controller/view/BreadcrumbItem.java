package com.raphaowl.whiteowl.controller.view;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BreadcrumbItem {
    private final String label;
    private final String url;
}
