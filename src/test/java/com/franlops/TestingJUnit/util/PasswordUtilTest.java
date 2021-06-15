package com.franlops.TestingJUnit.util;

import org.junit.Test;

import static com.franlops.TestingJUnit.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {

        assertEquals(WEAK, PasswordUtil.assessPassword("12ab!"));
    }

    @Test
    public void weak_when_has_only_letters() {

        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefgh"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {

        assertEquals(MEDIUM, PasswordUtil.assessPassword("123abcsa"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols() {
        assertEquals(STRONG, PasswordUtil.assessPassword("abcd123!"));
    }
}