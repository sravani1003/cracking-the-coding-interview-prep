package DynamicProgramming;

public class NQueens {
    int requiredCount = 8;
    public boolean nQueenSolve(int[][] board, int queenCount){
        if(queenCount >= requiredCount){
            return true;
        }
        for(int row = 0; row < requiredCount; row++){
            if(isSafe(board, row, queenCount)){
                board[row][queenCount] = 1;
                if(nQueenSolve(board, queenCount + 1) == true){
                    return true;
                }
                board[row][queenCount] = 0;
            }
        }
        return false;
    }

    public boolean isSafe(int[][] board, int row, int column){
        int r, c;

        for(c = 0; c < column; c++){
            if(board[row][c] == 1){
                return false;
            }
        }

        for(r = row, c = column; r >= 0 && c >= 0; r--, c--){
            if(board[r][c] == 1){
                return false;
            }
        }

        for(r = row, c = column; r < requiredCount && c >= 0; r++, c--){
            if(board[r][c] == 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] board = {
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0}
        };
        NQueens obj = new NQueens();
        obj.nQueenSolve(board, 0);
        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }
}
