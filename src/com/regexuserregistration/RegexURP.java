package com.regexuserregistration;

public class RegexURP {
    public static void main(String[] args) {
        System.out.println(".......Welcome to the User Registration Problem.........");
        UserOperator user = new UserOperator();
        user.firstName("Mohin");
        user.lastName("Sayyad");
        user.emailaddress("mohin@gmail.com");
        user.phoneNo("91 9604315270");
        user.passRule1("123asASD");
    }
}