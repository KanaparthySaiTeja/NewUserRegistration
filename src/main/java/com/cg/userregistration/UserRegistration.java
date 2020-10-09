package com.cg.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    static Scanner sc=new Scanner(System.in);


    public static void setPassword(String password) {
        String regex = "^(?=^.).{8,}$";
        if (password.matches(regex))
            System.out.println("Password is Valid");
        else
            System.out.println("Password is Invalid");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password");
        String password = sc.nextLine();
        setPassword(password);
        sc.close();
    }

}