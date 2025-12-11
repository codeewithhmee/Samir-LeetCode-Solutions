class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(n, 1, new ArrayList<>(), ans, k);
        return ans;
    }

    public void helper(int n, int count, List<Integer> temp, List<List<Integer>> ans, int k) {
        if (temp.size() == k) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if (count > n) {
            return;
        }

        // Pruning
        if (temp.size() + (n - count + 1) < k) {
            return;
        }

        temp.add(count);
        helper(n, count + 1, temp, ans, k);

        temp.remove(temp.size() - 1);
        helper(n, count + 1, temp, ans, k);
    }
}
