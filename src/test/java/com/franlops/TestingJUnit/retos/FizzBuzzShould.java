package com.franlops.TestingJUnit.retos;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzShould {

    /*
        Escenarios:
        Si el numero es divisible por 3 debe retornar "Fizz"
        Si el numero es divisible por 5, retorna "Buzz"
        Si el numero es divisible por 3 y por 5, retorna "FizzBuzz"
    * */

    @Test
    public void return_fizz_if_number_is_divisible_by_3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(12));
    }

    @Test
    public void return_buzz_if_number_is_divisible_by_5() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    public void return_fizzbuzz_if_number_is_divisible_by_3_and_by_5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }

    @Test
    public void return_number_is_this_is_not_divisible_by_3_or_5() {
        assertEquals("2", FizzBuzz.fizzBuzz(2));
        assertEquals("16", FizzBuzz.fizzBuzz(16));
    }
}