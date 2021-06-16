package com.franlops.TestingJUnit.retos;

public class FizzBuzz {

    public static String fizzBuzz(int n){
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if(n % 5 == 0){
            return "Buzz";
        } else if (n % 3 == 0){
            return "Fizz";
        }
        return "" + n;
    }
}
