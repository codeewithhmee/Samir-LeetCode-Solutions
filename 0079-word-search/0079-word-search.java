class Solution {
    public boolean exist(char[][] board, String word) {
    int[][] visited=new int[board.length][board[0].length];
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            if(helper(board,new StringBuilder(),word,i,j,visited))return true;
        }
    }
    return false ;

    }
    public boolean helper(char[][] board,StringBuilder sb,String word,int cr,int cc,int[][] visited){
        //base cases
        if (sb.length()>0 && sb.charAt(sb.length()-1) != word.charAt(sb.length()-1))return false;
        if(cr==board.length || cc==board[0].length || cr<0 || cc<0  || sb.length()>=word.length() || visited[cr][cc]==1){
            String str=sb.toString();
            if(str.equals(word))return true;
            return false;
        }
        visited[cr][cc]=1;
        sb.append(board[cr][cc]);
        //move right
        boolean r=helper(board,sb,word,cr,cc+1,visited);
        //move down
        boolean d=helper(board,sb,word,cr-1,cc,visited);
        //move left
        boolean l=helper(board,sb,word,cr,cc-1,visited);
        //move up
       boolean u= helper(board,sb,word,cr+1,cc,visited);
        //backtrack
        visited[cr][cc]=0;
        sb.deleteCharAt(sb.length() - 1);

        return r||d||l||u;

         
    }
}