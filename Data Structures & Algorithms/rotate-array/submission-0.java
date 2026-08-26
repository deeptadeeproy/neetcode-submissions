class Solution {
    public void rotate(int[] nums, int k) {
        
       int len = nums.length;
       int effK = k%len;

       int[] rotated = Arrays.copyOfRange(nums, len-effK, len);
       System.arraycopy(nums, 0, nums, effK, len-effK);
       System.arraycopy(rotated, 0, nums, 0, rotated.length);
       
    }
}