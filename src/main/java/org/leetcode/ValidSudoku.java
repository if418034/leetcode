package org.leetcode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {

    }

    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> exist = new HashSet();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char temp = board[i][j];
                if (board[i][j] != '.') {
                    if (
                            !exist.add(temp + " exist on row " + i) ||
                                    !exist.add(temp + " exist on col " + j) ||
                                    !exist.add(temp + " exist on box " + i / 3 + "-" + j / 3)
                    ) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
