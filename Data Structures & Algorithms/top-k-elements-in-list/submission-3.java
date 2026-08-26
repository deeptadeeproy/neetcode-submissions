class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> uniq = new HashMap<>();

        for (int n: nums) {
            uniq.merge(n, 1, Integer::sum);
        }

        int maxKey = 0;
        int maxFreq = 0;
        int i = 0;
        int[] topKs = new int[k];

        while (i < k) {
            for (Map.Entry<Integer, Integer> en: uniq.entrySet()) {
                if (maxFreq < en.getValue()) {
                    maxKey  = en.getKey();
                    maxFreq = en.getValue();
                }
            }
            topKs[i] = maxKey;
            uniq.remove(maxKey);
            maxFreq = 0;
            i++;
        }
        return topKs;
    }
}

