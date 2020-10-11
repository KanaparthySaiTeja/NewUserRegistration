package com.cg.userregistration;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean name(String name) throws HandleException {
        try {
            String regex = "^[A-Z][a-zA-Z]{2,}$";
            Pattern p = Pattern.compile( regex );
            Matcher m = p.matcher( name );
            return m.matches();
        }catch (Exception e){
            throw new HandleException( "Enter valid name" );

        }
    }

    public static boolean phNo(String num) throws HandleException {
        try {
            String regex = "^[0-9]{2}\\s[0-9]{10}$";
            Pattern p = Pattern.compile( regex );
            Matcher m = p.matcher( num );
            return m.matches();
        }catch (Exception e){
            throw new HandleException( "Enter valid number" );

        }
    }

    public static boolean emailId(String email) throws HandleException {
        try {
            String regex = "^[A-Za-z0-9]{1}[A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9]+(\\.[A-Za-z0-9]+){0,1}(\\.[A-Za-z]{2,})$";
            Pattern p = Pattern.compile( regex );
            Matcher m = p.matcher( email );
            return m.matches();
        }catch (Exception e){
            throw new HandleException( "Enter valid email" );
        }
    }

    public static boolean password(String pass) throws HandleException {
        try {
            String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?!.*[<>`])" + "(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)" + ".{8,}$";
            Pattern p = Pattern.compile( regex );
            Matcher m = p.matcher( pass );
            return m.matches();
        } catch (Exception e) {
            throw new HandleException( "Enter valid password" );
        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
    }

}