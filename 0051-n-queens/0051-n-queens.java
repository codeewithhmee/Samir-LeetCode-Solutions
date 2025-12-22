class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>> ans=new ArrayList<>();
        helper(board,board.length,0,ans);
        return ans;
        

    } 
    public void helper(char[][] board,int c,int cc,List<List<String>> ans){
        if(cc==board.length){
            //it is a valid case
            List<String> temp=new ArrayList<>();
            for(int i=0;i<board.length;i++){
                String s="";
                for(int j=0;j<board.length;j++){
                    char ch=board[i][j];
                    s=s+ch;
                }
                temp.add(s);
            }
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int cr=0;cr<board.length;cr++){
            if(isSafe(board,cr,cc)){
            board[cr][cc]='Q';
            helper(board,c,cc+1,ans);
            //backtrack
            board[cr][cc]='.';
        }
        }
    } 
    public boolean isSafe(char[][] board,int cr,int cc){
        //check left side
        for(int i=cc-1;i>=0;i--){
            if(board[cr][i]=='Q')return false;
        }
        //check up diagonal \
        for(int i=cr-1,j=cc-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q')return false;
        }
        //check low diognal
        for(int i=cr+1, j=cc-1;i<board.length && j>=0;i++,j--){
             if(board[i][j]=='Q')return false;
        }
        return true;
    }
}
