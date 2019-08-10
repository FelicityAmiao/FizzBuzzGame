package com.amiao;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private ByteArrayOutputStream byteArrayOutputStream;

    @BeforeEach
    public void setUp() {
        byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    @Test
    public void should_print_1_given_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.display(1);
        assertEquals("1", byteArrayOutputStream.toString());
    }

    @Test
    public void should_print_Fizz_given_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.display(3);
        assertEquals("Fizz", byteArrayOutputStream.toString());
    }

    @Test
    public void should_print_Fizz_given_6() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.display(6);
        assertEquals("Fizz", byteArrayOutputStream.toString());
    }

    @Test
    public void should_print_Fizz_given_9() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.display(9);
        assertEquals("Fizz", byteArrayOutputStream.toString());
    }

    @Test
    public void should_print_Buzz_given_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.display(5);
        assertEquals("Buzz", byteArrayOutputStream.toString());
    }

    @Test
    public void should_print_FizzBuzz_given_15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.display(15);
        assertEquals("FizzBuzz", byteArrayOutputStream.toString());
    }

    @Test
    public void should_print_Fizz_given_13() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.display(13);
        assertEquals("Fizz", byteArrayOutputStream.toString());
    }

    @Test
    public void should_print_Fizz_given_31() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.display(31);
        assertEquals("Fizz", byteArrayOutputStream.toString());
    }

    @Test
    public void should_print_Buzz_given_58() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.display(58);
        assertEquals("Buzz", byteArrayOutputStream.toString());
    }

    @Test
    public void should_print_FizzBuzz_given_53() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.display(53);
        assertEquals("FizzBuzz", byteArrayOutputStream.toString());
    }
}
