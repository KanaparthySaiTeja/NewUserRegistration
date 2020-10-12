package com.cg.userregistration;


import java.util.Scanner;
import java.util.function.Predicate;

public class UserRegistration {

    static Scanner sc = new Scanner(System.in);

    public static Validate validateEmailId() {
        Validate v1 = (email) -> {
            boolean value = true;
            if (email.matches("^[A-Za-z0-9]{1}[A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9]+(\\.[A-Za-z0-9]+){0,1}(\\.[A-Za-z]{2,})$"))
                value = true;
            else {
                value = false;
            }
            return value;
        };
        return v1;
    }
    private static boolean test(String str) {
        return str.matches("^[A-Z][a-zA-Z]{2,}$");
    }
    public static void main(String[] args) {
        System.out.println("Enter First name");
        String fname=sc.nextLine();
        Predicate<String> name = UserRegistration::test;
        System.out.println(name.test(fname));
        System.out.println("Enter Last name");
        String lname=sc.nextLine();
        System.out.println(name.test(lname));
        System.out.println("Enter EmailId");
        String email = sc.nextLine();
        UserRegistration.validateEmailId();
        boolean x = validateEmailId().validateinfo(email);
        if (x == true) {
            System.out.println("Email is valid ");
        } else {
            System.out.println("Invalid email");
        }
        System.out.println("Enter the password");
        String password = sc.nextLine();

        Predicate<String> passwordvalid = str -> str
                .matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$");
        System.out.println(passwordvalid.test(password));
        System.out.println("Enter Mobile Number");
        String mobile=sc.nextLine();
        Predicate<String> mobilevalid = str -> str.matches("^[0-9]{2}\\s[0-9]{10}$");
        System.out.println(mobilevalid.test(mobile));


    }
}