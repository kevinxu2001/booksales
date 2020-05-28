package com.kevin.booksales.service;

public class AppExceptionMessage {
    public static int APP_EXCEPTION_CODE = 20000;


    public static int CUSTOMER_NOT_EXIST_CODE = APP_EXCEPTION_CODE++;
    public static final String CUSTOMER_NOT_EXIST = "Customer does not exist！ {0}。";

    public static int ALREADY_PREMIUM_CODE = APP_EXCEPTION_CODE++;
    public static final String ALREADY_PREMIUM = "Already premium member ！ {0}。";

    public static int NORMAL_MEMBER_CAN_NOT_PAY_CODE = APP_EXCEPTION_CODE++;
    public static final String NORMAL_MEMBER_CAN_NOT_PAY = "Normal membership can't pay！ {0}。";

    public static int ORDER_NOT_EXIST_CODE = APP_EXCEPTION_CODE++;
    public static final String ORDER_NOT_EXIST = "Order does not exist！ {0}。";

    public static int ORDER_PAID_CODE = APP_EXCEPTION_CODE++;
    public static final String ORDER_PAID = "Order already paid！ {0}。";

}