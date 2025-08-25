package org.leetcode;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMIX"));
    }

    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = valueOf(s.charAt(i));

            int next = (i + 1 < s.length()) ? valueOf(s.charAt(i + 1)) : 0;

            if (current < next) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }

    public static int valueOf(Character s) {
        return switch (s) {
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 1;
        };
    }
}
