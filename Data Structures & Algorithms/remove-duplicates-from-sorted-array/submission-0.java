class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> uniq = new TreeSet<>();

        for (int n: nums) {
            uniq.add(n);
        }

        int i = 0;
        for (int n: uniq) {
            nums[i++] = n;
        }
        return uniq.size();
    }
}