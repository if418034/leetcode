package org.leetcode;

public class AsciiCounter {
    
    public static int countTotalAscii(String str) {
        int total = 0;
        for (char c : str.toCharArray()) {
            total += (int) c;
        }
        return total;
    }
    
    public static void main(String[] args) {
        String testString = "thisstring";
        int totalAscii = countTotalAscii(testString);
        
        System.out.println("String: " + testString);
        System.out.println("Total ASCII value: " + totalAscii);
        
        // Let's also show each character and its ASCII value
        System.out.println("\nBreakdown:");
        for (int i = 0; i < testString.length(); i++) {
            char c = testString.charAt(i);
            System.out.println("'" + c + "' = " + (int) c);
        }
    }
}

