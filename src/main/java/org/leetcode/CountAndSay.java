package org.leetcode;

public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            s = rle(s);
        }
        return s;
    }

    private static String rle(String s) {
        char ch = s.charAt(0);
        int count = 1;
        int n = s.length(), i = 1;
        StringBuilder sb = new StringBuilder();
        while (i < n) {
            if (s.charAt(i) == ch) {
                count++;
            } else {
                sb.append(count).append(ch);
                count = 1;
                ch = s.charAt(i);
            }
            i++;
        }
        sb.append(count).append(ch);
        return sb.toString();
    }

}
