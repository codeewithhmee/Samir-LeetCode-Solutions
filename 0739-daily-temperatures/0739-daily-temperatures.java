class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[temperatures.length];
        nge[nge.length - 1] = 0;
        st.push(nge.length-1);
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]) {
                st.pop();
            }
            if (st.size() <= 0) {
                nge[i] = 0;
            } else {
                nge[i] = st.peek()-i;

            }
            st.push(i);

        }
   
        return nge;
    }
}