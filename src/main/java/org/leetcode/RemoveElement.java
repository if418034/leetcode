package org.leetcode;

public class RemoveElement {
    public static void main(String[] args) {
        String[] input = {"a"};
        System.out.println(longestCommonPrefix(input));
    }

    public static String longestCommonPrefix(String[] strs) {
        String hasil = "";
        int intro = strs[0].length();
        for (int i = 0; i < intro; i++) {
            if (i < strs.length - 1 && strs[i + 1].length() < strs[i].length()) {
                intro = strs[i + 1].length();
            }
            if ((strs[i].charAt(i) == strs[i + 1].charAt(i)) && (strs[1].charAt(i) == strs[i + 2].charAt(i))) {
                hasil += strs[0].charAt(i);
            }
        }
        return hasil;
    }
}
