package com.kevin.booksales.domain.membership;

public enum MembershipLevel {
    NORMAL(1, "premium", 100),
    PREMIUM(1, "premium", 88),
    VIP(2, "vip", 66);

    MembershipLevel(int code, String title, int discount) {
        this.code = code;
        this.title = title;
        this.discount = discount;
    }


    public static int getDiscount(int code){
        for(MembershipLevel ca : MembershipLevel.values()){
            if(ca.getCode() == code){
                return ca.discount;
            }
        }
        return 0;
    }



    private int code;
    private String title;
    private int discount;

    public int getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public int getDiscount() {
        return discount;
    }



}
