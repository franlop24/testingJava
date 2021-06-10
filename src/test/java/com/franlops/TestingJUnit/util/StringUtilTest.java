package com.franlops.TestingJUnit.util;

//import static org.junit.Assert.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String result = StringUtil.repeat("hola", 2);

        if(!result.equals("holaholahola")){
            System.out.println("ERROR");
        }

        String result2 = StringUtil.repeat("hola", 2);

        if(!result2.equals("hola")){
            System.out.println("ERROR");
        }
    }
}