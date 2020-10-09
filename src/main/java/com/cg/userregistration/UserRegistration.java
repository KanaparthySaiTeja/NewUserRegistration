package com.cg.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {




    // UC1 and UC2 - First name starts with Cap and has minimum 3 characters
    public  boolean names(String name) {
        return (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", name) == true);
    }



    /*
     * UC 3 - enter a valid email UC 9 - Cleared All Sample Provided
     */
    public boolean email(String emailId) {
        return (Pattern.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*$", emailId) == true);
    }

    // UC4 - Mobile Format
    public boolean mobile(String mobileNum) {
        return(Pattern.matches("^[1-9]{2}\\s{1}[1-9]{1}[0-9]{9}$", mobileNum) == true);
    }

    // UC 5 to 8 - Password
    public boolean password(String pass) {
        return (Pattern.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s)[a-zA-Z0-9]*[^a-zA-Z0-9\\s]{1}[a-zA-Z0-9]*$",
                pass) == true);
    }

    public String checkMood(String word) {
        if (word.contains("Sad"))
            return "Sad";
        else
            return "Happy";
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    UserRegistration ur = new UserRegistration();
        System.out.println("Welcome to User Registration Program");
            System.out.println("Enter First name");
            System.out.println("First Name: "+ ur.names(scanner.nextLine()));
            System.out.println("Enter Last name");
            System.out.println("Last Name: "+ ur.names(scanner.nextLine()));
            System.out.println("Enter EmailId");
            System.out.println("EmailId: "+ ur.email(scanner.nextLine()));
            System.out.println("Enter Mobile Number");
            System.out.println("Mobile Number: "+ ur.mobile(scanner.nextLine()));
            System.out.println("Enter Password");
            System.out.println("Password: "+ ur.password(scanner.nextLine()));
            System.out.println("How is your Mood today");
            System.out.println(ur.checkMood(scanner.nextLine()));


    }

}