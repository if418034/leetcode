package org.leetcode;

public class FirstIndex {
    public static void main(String[] args) {
        String haystack = "mississippi";
        System.out.println(strStr(haystack, "issi"));
    }

    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i <= n - m; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, i + m).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

}
