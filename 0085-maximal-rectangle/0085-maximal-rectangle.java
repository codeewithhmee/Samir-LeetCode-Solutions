class Solution {
    public int maximalRectangle(char[][] matrix) {
        int ans=0;
        for(int i=0;i<matrix.length;i++){
          int[] base=new int[matrix[0].length];
          for(int j=0;j<matrix[0].length;j++){
            base[j]=height(matrix,i,j);
          }
          int a=area(base);
          ans=Math.max(ans,a);
        }
        return ans;
    }
    public int height(char[][] arr,int cr,int cc){
        int h=0;
        for(int i=cr;i>=0;i--){
            if(arr[i][cc]=='0'){
                return h;
            }else{
                h++;
            }
        }
        return h;
    }
    public int area(int[] arr){
        int[] preivous=pse(arr);
        int[] next=nse(arr);
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int base=next[i]-preivous[i]-1;
            int he=arr[i];
            ans=Math.max(ans,base*he);
        }
        return ans;
    }
    public int[] pse(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            while(st.size()>0 && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public int[] nse(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(st.size()>0 && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=arr.length;
            }else{
                ans[i]=st.peek();
            }
            st.push(i); 
        }
        return ans;
    }
}