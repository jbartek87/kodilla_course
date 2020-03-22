package com.kodilla.hibernate.manytomany.facade;

public class SearchProcessingException extends Exception {
    public static String ERR_COMPANY = "Company not found";
    public static String ERR_EMPLOYEE = "Employee not found";

    public SearchProcessingException(String message){
        super(message);
    }
}
