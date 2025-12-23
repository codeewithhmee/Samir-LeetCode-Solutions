class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (helper(board, word, i, j, 0, visited)) return true;
            }
        }
        return false;
    }

    private boolean helper(char[][] board, String word, int cr, int cc, int idx, boolean[][] visited) {
        // base cases
        if (cr < 0 || cc < 0 || cr >= board.length || cc >= board[0].length) return false;
        if (visited[cr][cc]) return false;
        if (board[cr][cc] != word.charAt(idx)) return false;
        if (idx == word.length() - 1) return true;

        // visited
        visited[cr][cc] = true;

       
        boolean found = helper(board, word, cr, cc + 1, idx + 1, visited) || // right
                        helper(board, word, cr + 1, cc, idx + 1, visited) || // down
                        helper(board, word, cr, cc - 1, idx + 1, visited) || // left
                        helper(board, word, cr - 1, cc, idx + 1, visited);   // up

        // backtrack
        visited[cr][cc] = false;

        return found;
    }
}
