package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {

    @Test
    public void firstNameIsValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.validate("Suraj");
        Assertions.assertTrue(result);
    }
    @Test
    public void firstNameIsInValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.validate("suraj");
        Assertions.assertFalse(result);
    }
    @Test
    public void lastNameIsValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.validate("Temkar");
        Assertions.assertTrue(result);
    }
    @Test
    public void lastNameIsInValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.validate("Te@mkar");
        Assertions.assertFalse(result);
    }
    @Test
    public void emailIsValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.validate("Temkar@92gmail.com");
        Assertions.assertTrue(result);
    }
    @Test
    public void emailIsInValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.validate("Te@.add.");
        Assertions.assertFalse(result);
    }
    @Test
    public void mobileNumberIsValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.validate("91 9503076240");
        Assertions.assertTrue(result);
    }
    @Test
    public void mobileNumberIsInValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.validate("45466786886867");
        Assertions.assertFalse(result);
    }
    @Test
    public void passwordIsIsValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.validate("surajtemkar");
        Assertions.assertTrue(result);
    }
    @Test
    public void passwordIsIsInValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.validate("suraj");
        Assertions.assertFalse(result);
    }
    @Test
    public void passwordIsIsValidSecond() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.validate("Suraj@123");
        Assertions.assertTrue(result);
    }
    @Test
    public void passwordIsIsInValidSecond() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.validate("sueah567");
        Assertions.assertFalse(result);
    }
    @Test
    public void passwordIsIsValidThree() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.validate("Suraj@123");
        Assertions.assertTrue(result);
    }
    @Test
    public void passwordIsIsInValidThree() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.validate("Te@mkar");
        Assertions.assertFalse(result);
    }
    @Test
    public void passwordIsIsValidForth() {
        UserValidator userValidator = new UserValidator();
        boolean result = true;
        result = userValidator.validate("Suraj@123");
        Assertions.assertTrue(result);
    }
    @Test
    public void passwordIsIsInValidForth() {
        UserValidator userValidator = new UserValidator();
        boolean result = false;
        result = userValidator.validate("Te@mkar");
        Assertions.assertFalse(result);
    }

}


