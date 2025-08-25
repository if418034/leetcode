package org.leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(421212124));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev = 0;
        int num = x;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        return (rev == x);
    }
}
