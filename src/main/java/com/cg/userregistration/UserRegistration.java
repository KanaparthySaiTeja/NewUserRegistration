package com.cg.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    static Scanner sc=new Scanner(System.in);
    public static void main( String[] args )
    {
        System.out.println( "Hello" );
        lastName();
    }
    public static void lastName() {
        System.out.println("Enter Last Name");
        String lN = sc.nextLine();
        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lN) == true)
            System.out.println("Valid Last Name");
        else
            System.out.println("Invalid Last Name");
    }
}