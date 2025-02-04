package org.leetcode;

public class ZigzagConversion {
    public static void main(String[] args) {
//        System.out.println(convert("PAYPALISHIRING", 4));
//        System.out.println(convert("PAYPALISHIRINGAGAIN", 3));
//        System.out.println(convert("PAYPALISHIRING", 3));
        System.out.println(convert("PAYPALISHIRINGAGAINISNTITAWESOME", 7));

    }

    public static String convert(String s, int numRows) {
        int n;
        String temp = "";
        int first = numRows + (numRows - 2);
        for (int i = 0; i < numRows; i++) {
            boolean flag = (i == 0 || i == numRows - 1);
            n = i;
            System.out.println(temp);
            temp += s.charAt(n);
            System.out.print(n + " ");
            for (int j = 0; j < s.length(); j++) {
                if (flag) {
                    n = n + first;
                    if (n > s.length() - 1) break;
                    temp += s.charAt(n);
                    System.out.print(n + " ");
                } else {
                    n = n + first - (2 * i);
                    if (n > s.length() - 1) break;
                    temp += s.charAt(n);
                    System.out.print(n + " ");
                    if (n + (first - (first - (2 * i))) > s.length() - 1) break;
                    temp += s.charAt(n + (first - (first - (2 * i))));
                    System.out.print(n + (first - (first - (2 * i))) + " ");
                    n = n + (first - (first - (2 * i)));
                }
            }
        }
        return temp;
    }
}
