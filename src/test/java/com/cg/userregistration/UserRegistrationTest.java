package com.cg.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration ur=new UserRegistration();

    @Test
    public void firstNameValidation(){
        Assert.assertTrue(ur.names("Sai"));
    }
    @Test
    public void lastNameValidation(){
        Assert.assertTrue(ur.names("Teja"));
    }

    @Test
    public void emailValidation(){
        Assert.assertTrue(ur.email("Sai.Teja@nitt.edu"));
    }
    @Test
    public void mobileValidation(){
        Assert.assertTrue(ur.mobile("91 9494993238"));
    }
    @Test
    public void passwordValidation(){
        Assert.assertTrue(ur.password("Saitej@4528"));
    }

    @Test
    public void should_returnSad(){
        Assert.assertEquals("Sad",ur.checkMood("Sad"));
    }

}
