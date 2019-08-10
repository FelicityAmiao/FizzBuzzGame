package com.amiao;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzz2Test {

    @ParameterizedTest(name = "should return {0} given {1}")
    @CsvSource({
            "1, '1'",
            "2, '2'",
            "3, 'Fizz'",
            "6, 'Fizz'",
            "5, 'Buzz'",
            "15, 'FizzBuzz'",
            "13, 'Fizz'",
            "31, 'Fizz'",
            "52, 'Buzz'",
            "51, 'FizzBuzz'",
            "53, 'FizzBuzz'"
    })
    void test(int input, String fizzBuzzStr) {
        assertEquals(fizzBuzzStr, FizzBuzz2.of(input));
    }
}
