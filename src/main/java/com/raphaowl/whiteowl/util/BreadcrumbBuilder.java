package com.raphaowl.whiteowl.util;

import java.util.List;

import com.raphaowl.whiteowl.controller.view.BreadcrumbItem;

public final class BreadcrumbBuilder {

    private BreadcrumbBuilder breadcrumb() { return this; }

    public static List<BreadcrumbItem> buildRootFor(String root) {
        return List.of(new BreadcrumbItem(root, null));
    }

    public static List<BreadcrumbItem> buildBreadcrumb(String page, String root, String breadcrumb) {
        return List.of(
                new BreadcrumbItem(page, root),
                new BreadcrumbItem(breadcrumb, null));
    }

}
