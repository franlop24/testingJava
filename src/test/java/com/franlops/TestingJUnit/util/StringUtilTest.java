package com.franlops.TestingJUnit.util;

//import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeat_string_once(){
        String result = StringUtil.repeat("hola", 1);
        Assert.assertEquals("hola", result);
    }

    @Test
    public void repeat_string_multiple_times(){
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeat_string_sero_times(){
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repear_string_negative_times(){
        Assert.assertEquals("", StringUtil.repeat("hola", -1));

    }
}