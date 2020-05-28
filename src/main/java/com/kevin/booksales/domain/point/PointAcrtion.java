package com.kevin.booksales.domain.point;

public enum PointAcrtion {
    ORDER_PAID(101, "ORDER_PAID");

    PointAcrtion(int code, String title) {
        this.code = code;
        this.title = title;
    }


    public int getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    private int code;
    private String title;
}
