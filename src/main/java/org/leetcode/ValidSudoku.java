package org.leetcode;

import java.util.LinkedHashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {

    }

    public static boolean isValidSudoku(char[][] board) {
        Set hashSet = new LinkedHashSet();
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board[1].length; j++) {
                if(hashSet.add(board[i][j])) {

                }
            }
        }
        return false;
    }
}
