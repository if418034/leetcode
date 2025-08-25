package org.leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemakeValidSudoku {
    public static void main(String[] args) {
        char[][] input = {{'1','2','.','.','3','.','.','.','.'},
        {'4','.','.','5','.','.','.','.','.'},
        {'.','9','1','.','.','.','.','.','3'},
        {'5','.','.','.','6','.','.','.','4'},
        {'.','.','.','8','.','3','.','.','5'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','.','.','.','.','.','2','.','.'},
        {'.','.','.','4','1','9','.','.','8'},
        {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(input));
}
    public static boolean isValidSudoku(char[][] board) {
        Set<String> check = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.') {
                    if (!check.add("column " + i + " contains " + board[i][j])
                            || !check.add("row " + j + " contains " + board[i][j])
                            || !check.add("box " + i/3 + "-" + j/3 + " contains " + board[i][j])) {
                        return false;
                    }
                }
            }
        }
         return true;
    }

    public static boolean mostEfficientSolution(char[][] board) {
        int[] rowMask = new int[9];
        int[] colMask = new int[9];
        int[] boxMask = new int[9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;

                int bit = 1 << (c - '0');
                int box = (i / 3) * 3 + (j / 3);

                if ((rowMask[i] & bit) != 0 ||
                        (colMask[j] & bit) != 0 ||
                        (boxMask[box] & bit) != 0) return false;

                rowMask[i] |= bit;
                colMask[j] |= bit;
                boxMask[box] |= bit;
            }
        }
        return true;
    }

}
