class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> m = new HashMap<>();
        int mx = 0;
        for (int i = 0; i < arr.length; i++) {
            int c = arr[i];
            if (m.containsKey(c - difference))
                m.put(c, m.get(c - difference) + 1);
            else
                m.put(c, 1);
            mx = Math.max(mx, m.get(c));
        }
        return mx;
    }
}
