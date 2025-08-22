package org.leetcode;

public class LongestPalindromeGreenest {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("ac"));
        System.out.println(longestPalindrome("detartrated"));
    }

    public static String longestPalindrome(String s) {
        String temp = "";
        String check = "";
        if (s.length() < 1) {
            return s;
        }
        for (int i = 0; i < s.length() - 2; i++) {
            for (int j = s.length() - 1; j > i; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    check = s.substring(i, j + 1);
                    if (isPalindrome(check)) {
                        temp = temp.length() > check.length() ? temp : check;
                    }
                }
            }
        }
        return temp;
    }

    public static boolean isPalindrome(String a) {
        int e = 0;
        while (e <= a.length() / 2 && !a.isEmpty() && a.length() != 1) {
            if (a.charAt(e) == a.charAt(a.length() - 1 - e)) {
                e++;
                isPalindrome(a.substring(1, a.length() - 1));
            } else {
                return false;
            }
        }
        return true;
    }
}