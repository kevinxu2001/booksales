package com.kevin.booksales.domain.order;

public enum OrderStatus {
    CREATED(0, "CREATED"),
    PAID(1, "PAID");

    OrderStatus(int code, String title) {
        this.code = code;
        this.title = title;
    }


    public static String getTitle(int code){
        for(OrderStatus ca : OrderStatus.values()){
            if(ca.getCode() == code){
                return ca.getTitle();
            }
        }
        return "";
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
