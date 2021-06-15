package com.franlops.TestingJUnit.util;

public class PasswordUtil {

    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG
    }

    public static SecurityLevel assessPassword(String password){

        if (password.length() < 8) {
            return SecurityLevel.WEAK;
        }

        if (password.matches("[a-zA-Z]+")){
            return SecurityLevel.WEAK;
        }

        if (password.matches("[0-9a-zA-Z]+")){
            return SecurityLevel.MEDIUM;
        }
        return SecurityLevel.STRONG;
    }
}
