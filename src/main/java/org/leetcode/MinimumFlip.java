package org.leetcode;

public class MinimumFlip {
    public static int minimumFlips(String target) {
        int flips = 0;
        char currentBit = '0'; // start with all 0s

        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) != currentBit) {
                flips++;
                // flip currentBit for the next expected section
                currentBit = currentBit == '0' ? '1' : '0';
            }
        }

        return flips;
    }


    public static void main(String[] args) {
        String target = "01011";
        StringBuilder current = new StringBuilder("00000");

        System.out.println("Target:   " + target);
        System.out.println("Mulai:    " + current);

        int flips = 0;
        char currentBit = '0';

        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) != currentBit) {
                flips++;
                // Lakukan flip dari index ke-i sampai akhir
                for (int j = i; j < current.length(); j++) {
                    char flipped = current.charAt(j) == '0' ? '1' : '0';
                    current.setCharAt(j, flipped);
                }

                System.out.println("Flip ke-" + flips + " di posisi " + (i + 1) + ": " + current);
                currentBit = currentBit == '0' ? '1' : '0'; // update expected value
            }
        }

        System.out.println("Total flip: " + flips);
    }
}
