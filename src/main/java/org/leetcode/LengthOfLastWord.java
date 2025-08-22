package org.leetcode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(String s) {
        String[] asd = s.trim().split(" ");
        return asd[asd.length - 1].length();
    }
}
