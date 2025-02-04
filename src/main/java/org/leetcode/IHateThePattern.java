package org.leetcode;

public class IHateThePattern {
    public static void main(String[] args) {
        System.out.println(iHateThePattern(4));
    }

    public static int iHateThePattern(int n) {
        int buffer1 = 1;
        int max = n * (n + 1);
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print(buffer1++);
                System.out.print("*");
            }

            for (int j = i; j <= n; j++) {
                System.out.print(max - (n - j));
                if (j < n) {
                    System.out.print("*");
                }
            }
            max = max - (n - i + 1);

            System.out.println();

        }
        return 0;
    }
}
