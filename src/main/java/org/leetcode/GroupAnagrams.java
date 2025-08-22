package org.leetcode;

import java.util.LinkedList;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] fafa = {"post", "spot", "stop", "rank", "karn"};
        System.out.println(groupAnagrams(fafa));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new LinkedList<>();
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length() && strs[i].length() == strs[i + 1].length(); j++) {
                if ()
            }
        }
        return null;
    }
}
