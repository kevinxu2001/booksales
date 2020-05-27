package com.kevin.booksales.service;

public class AppExceptionMessage {
    public static int APP_EXCEPTION_CODE = 20000;


    public static int CUSTOMER_NOT_EXIST_CODE = APP_EXCEPTION_CODE++;
    public static final String CUSTOMER_NOT_EXIST = "Customer does not exist！ {0}。";

    public static int CREDIT_ACTION_NOT_EXIST_CODE = APP_EXCEPTION_CODE++;
    public static final String CREDIT_ACTION_NOT_EXIST = "Action code not exist！ {0}。";

}