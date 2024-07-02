package com.icehufs.icebreaker.entity;

public enum ArticleCategoryEnum {
    GENERAL(0),
    REQUEST(1),
    NOTIFICATION(2);

    private final int id;

    ArticleCategoryEnum(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}