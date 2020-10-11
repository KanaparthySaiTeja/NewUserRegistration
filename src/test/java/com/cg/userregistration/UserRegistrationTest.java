package com.cg.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void firstNameVaidation() throws HandleException {
        try {
            UserRegistration ur = new UserRegistration();
            Assert.assertTrue( ur.name( "Sai" ) );
        } catch (Exception e) {
            throw new HandleException( "Enter the valid first name" );
        }
    }
    @Test
    public void lastNameVaidation() throws HandleException {
        try {
            UserRegistration ur = new UserRegistration();
            Assert.assertTrue( ur.name( "Teja" ) );
        } catch (Exception e) {
            throw new HandleException( "Enter the valid last name" );
        }
    }
    @Test
    public void mobileVaidation() throws HandleException {
        try {
            UserRegistration ur = new UserRegistration();
            Assert.assertTrue( ur.phNo( "91 2954624587" ) );
        } catch (Exception e) {
            throw new HandleException( "Enter the valid mobile number" );
        }
    }
    @Test
    public void passwordVaidation() throws HandleException {
        try {
            UserRegistration ur = new UserRegistration();
            Assert.assertTrue( ur.password( "Saiiteja@345" ) );
        } catch (Exception e) {
            throw new HandleException( "Enter the valid password" );
        }
    }


    @Test
    public void emailVaidation() throws HandleException {
        try {
            UserRegistration ur = new UserRegistration();
            Assert.assertEquals( true, ur.emailId( "saiteja@gmail.com" ) );
        } catch (Exception e) {
            throw new HandleException( "Enter valid email" );
        }
    }
}



