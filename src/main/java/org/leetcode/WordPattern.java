package org.leetcode;

import java.util.HashMap;

public class WordPattern {

    public static void main(String[] args) {
        String s1 = "abba";
        String s2 = "dog cat catcat";
        Integer size = s1.length();
        String[] s1arr = new String[size];
        String[] s2arr = s2.split(" ");

        System.out.println(s2arr);

        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> dupcheck = new HashMap<>();;
        if( s1arr.length != s2arr.length ){
            System.out.println("RUSAK"); return;}
        for (int i = 0; i < size; i++) {
            s1arr[i] = s1.substring(i,i+1);
            System.out.println(s1arr[i]);
            System.out.println(s2arr[i]);
            if(map.containsKey(s1arr[i])){
                if(!map.get(s1arr[i]).equals(s2arr[i])){
                    System.out.println("RUSAK");
                    return;
                } else if (dupcheck.get(s2arr[i]).equals(s1arr[i])){
                    System.out.println("RUSAK");
                    return;
                }
            }else{
                map.put(s1arr[i],s2arr[i]);
                dupcheck.put(s2arr[i],s1arr[i]);;
            }


        }

        System.out.println("BENER");

    }

}