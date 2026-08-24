class Solution {
    public int[] topKFrequent(int[] nums, int k) throws IllegalArgumentException {
        Map<Integer, Integer> uniqueMap = new HashMap<>();
        for (int n: nums) {
            uniqueMap.merge(n, 1, Integer::sum);
        }

        int[] topKs = new int[k];
        
        for (int i = 0; i < k; i++) {
            int maxKey = 0;
            int maxFreq = -1;
           

            for (Map.Entry<Integer, Integer> entry: uniqueMap.entrySet()) {
                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    maxKey = entry.getKey();
                }
            }
            topKs[i] = maxKey;
            uniqueMap.remove(maxKey);
        }
        return topKs;
    }
    
}
