package recursions;

import java.util.Arrays;

public class FindWordIn2Darray {

    /* * The word can be constructed from letters of sequentially
    adjacent cells, where adjacent cells are horizontally or vertically neighboring.
    The same letter cell may not be used more than once.

    Input: board = [["A","B","C","E"],[¸],["A","D","E","E"]], word = "ABCCED"
    Output: true
    */

    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        Integer[] abc={1,2};
        Arrays.stream(abc).filter(e->e/2==0).



        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Start DFS if first letter matches
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, i, j, word, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int row, int col, String word, int index) {
        if (index == word.length()) return true; // Word found

        // Boundary and character check
        if (row < 0 || row >= board.length ||
                col < 0 || col >= board[0].length ||
                board[row][col] != word.charAt(index)) {
            return false;
        }

        char temp = board[row][col]; // Save character
        board[row][col] = '#';       // Mark as visited

        // Explore in 4 directions
        boolean found = dfs(board, row + 1, col, word, index + 1) ||
                dfs(board, row - 1, col, word, index + 1) ||
                dfs(board, row, col + 1, word, index + 1) ||
                dfs(board, row, col - 1, word, index + 1);

        board[row][col] = temp; // Restore original character
        return found;
    }

    // Example usage
    public static void main(String[] args) {
        FindWordIn2Darray ws = new FindWordIn2Darray();
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        System.out.println(ws.exist(board, "ABCCED")); // true
        System.out.println(ws.exist(board, "SEE"));    // true
        System.out.println(ws.exist(board, "ABCB"));   // false
    }
}
