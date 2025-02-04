package org.leetcode;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(5));
    }

    public static List<String> fizzBuzz(int n) {
        int i = 1;
        List<String> response = new LinkedList<>();
        while(i <= n) {
            if (i % 3 == 0 && i % 5 == 0) {
                response.add("FizzBuzz");
            } else if (i % 3 == 0) {
                response.add("Fizz");
            } else if (i % 5 == 0) {
                response.add("Buzz");
            } else {
                response.add(String.valueOf(i));
            }
        }
        return response;
    }
}
