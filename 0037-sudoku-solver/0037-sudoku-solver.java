class Solution {
    public void solveSudoku(char[][] board) {
helper(board,0,0);
    }

    public boolean helper(char[][] board, int cr, int cc) {

        if (cr == 9)return true;

        if (cc == 9) return helper(board, cr+1, 0);
       
        if (board[cr][cc] != '.') return helper(board, cr, cc + 1);
        for(char c='1';c<='9';c++){
            if(isValid(board,cr,cc,c)){
                board[cr][cc]=c;
                if(helper(board,cr,cc+1))return true;
                board[cr][cc]='.';
            }
        }
        return false;
    }
    public boolean isValid(char[][] board,int cr,int cc,char c){
        //checking column
        for(int i=0;i<9;i++){
            if(board[i][cc]==c && i!=cr)return false;

        }
        //checking row
        for(int i=0;i<9;i++){
            if(board[cr][i]==c && cc!=i)return false;
        }
        //checking 3*3
        int startingRow=0;
        int startingColumn=0;
        //starting row
        if(cr>5){
            startingRow=6;
            }else if(cr>2){
                startingRow=3;
            }
            else{
                startingRow=0;
            }
            //starting column
             if(cc>5){
            startingColumn=6;
            }else if(cc>2){
                startingColumn=3;
            }
            else{
                startingColumn=0;
            }
            //now check
            for(int i=startingRow;i<startingRow+3;i++){
                for(int j=startingColumn;j<startingColumn+3;j++){
                    if(board[i][j]==c && i!=cr && j!=cc)return false;
                }
            }
            return true;
        
    }
}