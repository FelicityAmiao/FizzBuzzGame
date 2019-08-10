package com.amiao;

import static java.lang.String.valueOf;

public class FizzBuzz3 {
    public static String of(int input) {
        String result = "";
        if(isRelatedTo(input, 3)) result += "Fizz";
        if(isRelatedTo(input, 5)) result += "Buzz";
        if(result.isEmpty()) result += valueOf(input);
        return result;
    }

    private static boolean isRelatedTo(int input, int i) {
        return input % i == 0 || valueOf(input).contains(valueOf(i));
    }
}
