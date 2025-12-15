class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(arr[i], '.');
        }

        helper(n, 0, ans, arr);
        return ans;
    }

    public void helper(int n, int column, List<List<String>> ans, char[][] arr) {
        if (column >= n) {
            //it is valid
            List<String> temp=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String s = "";
                for (int j = 0; j < n; j++) {
                    char c = arr[i][j];
                    s = s + c;
                }
                temp.add(s);
            }
            ans.add(temp);
            return;

        }
        for (int row = 0; row < n; row++) {
            if (isValid(column,row,arr,n)) {
                arr[row][column] = 'Q';
                helper(n, column + 1, ans, arr);
                arr[row][column]='.';
            }
        }

    }
    public boolean isValid(int cc,int cr,char[][] arr,int n){
        //checking left
        for(int i=0;i<cc;i++){
            if(arr[cr][i]=='Q')return false;
        }
        //checking diognal upper left
        int r=cr-1;
        int c=cc-1;
        while(r>=0 && c>=0){
            if(arr[r][c]=='Q')return false;
            r--;
            c--;
        }
        //checking lower diognal left
        r=cr+1;
        c=cc-1;
            while(r<n && c>=0){
            if(arr[r][c]=='Q')return false;
            r++;
            c--;
        }
return true;
    }
}