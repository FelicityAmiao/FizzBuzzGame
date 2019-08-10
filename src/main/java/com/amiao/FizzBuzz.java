package com.amiao;

import static java.lang.String.valueOf;

public class FizzBuzz {
    public static final int FIZZ_NUM = 3;
    public static final int BUZZ_NUM = 5;

    public void display(int i) {
        if (isRelatedTo(i, FIZZ_NUM) && isRelatedTo(i, BUZZ_NUM)) {
            System.out.print("FizzBuzz");
        } else if (isRelatedTo(i, FIZZ_NUM)) {
            System.out.print("Fizz");
        } else if (isRelatedTo(i, BUZZ_NUM)) {
            System.out.print("Buzz");
        } else {
            System.out.print(i);
        }
    }

    private boolean isRelatedTo(int i, int fizzNum) {
        return isRelatedTo(i, fizzNum) || valueOf(i).contains(valueOf(fizzNum));
    }

    public static String of(int input) {
        String result = "";
        if(isRelated2(input, 3)) result += "Fizz";
        if(isRelated2(input, 5)) result += "Buzz";
        if(result.isEmpty()) result += input;
        return result;
    }

    private static boolean isRelated2(int input, int i) {
        return input % i == 0 || valueOf(input).contains(valueOf(i));
    }
}
