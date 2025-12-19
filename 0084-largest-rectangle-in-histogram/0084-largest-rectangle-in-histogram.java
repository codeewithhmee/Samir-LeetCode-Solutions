class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        //first fnd previous smaller element 
        int[] pse=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(st.size()>0 && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.size()==0){
                pse[i]=-1;
            }else{
                pse[i]=st.peek();
            }
            st.push(i);
        }
        //find nse
         int[] nse=new int[n];
        Stack<Integer> st1=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(st1.size()>0 && heights[st1.peek()]>=heights[i]){
                st1.pop();
            }
            if(st1.size()==0){
                nse[i]=n;
            }else{
                nse[i]=st1.peek();
            }
            st1.push(i);
        }
        //now find the maxm rectangle
        int ans=0;
        for(int i=0;i<heights.length;i++){
            int base=nse[i]-pse[i]-1;
            int h=heights[i];
            ans=Math.max(ans,h*base);
        }
        return ans;
    }
}