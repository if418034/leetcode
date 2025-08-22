package org.leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-321));
    }

    public static int reverse(int x) {
        String y = String.valueOf(x < 0 ? Math.abs(x) : x);
        for (int i = 2; i <= y.length(); i++) {
            y += y.charAt(y.length() - i);
            y = y.substring(0, y.length() - (i + 1)) + y.substring(y.length() - i);
        }

        return Integer.valueOf(x < 0 ? "-" + y : y);
    }
}
