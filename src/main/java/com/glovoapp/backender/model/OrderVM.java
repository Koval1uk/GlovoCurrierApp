package com.glovoapp.backender.model;

public class OrderVM {
    private String id;
    private String description;

    public OrderVM(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
