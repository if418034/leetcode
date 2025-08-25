package org.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat","ac","bd","aac","bbd","aacc","bbdd","acc","bdd"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> stash = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int[] temp = new int[26];
            for (int j = 0; j < strs[i].length(); j++) {
                temp[strs[i].charAt(j) - 'a']++;
            }

            String sb = "";
            for (int j = 0; j < 26; j++) {
                sb += temp[j] + "#";
            }
            if (stash.containsKey(sb)) {
                stash.get(sb).add(strs[i]);
            } else {
                stash.put(sb, new ArrayList<>(List.of(strs[i])));
            }

        }

        return List.copyOf(stash.values());
    }
}
