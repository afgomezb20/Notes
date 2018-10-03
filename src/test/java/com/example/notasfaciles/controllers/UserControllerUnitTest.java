package com.example.notasfaciles.controllers;

import com.example.notasfaciles.controller.UserController;
import org.junit.Assert;
import org.junit.Test;

public class UserControllerUnitTest {

    private UserController userController;

    @Test
    public void itShouldSaySameId () {
        //Assert.assertEquals("Andres", userController.getUserById(new Long(1)).getName());
        Assert.assertTrue("Test Sucesfull", userController.getAllUsers().size() == 4);
    }
}
