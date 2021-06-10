package com.franlops.TestingJUnit.util;

//import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeat(){

        //Test 1
        String result = StringUtil.repeat("hola", 3);
        Assert.assertEquals("holaholahola", result);

        //Test2
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }


}