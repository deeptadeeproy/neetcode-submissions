class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();
        int l = 0, r = 0, res = 0;

        while (r < s.length()) {
            char ch = s.charAt(r);
            if (!set.contains(ch)) {
                set.add(ch);
                res = Math.max(res, r-l+1);
                r++;
            } else {
                set.remove(s.charAt(l));
                l++;
            }
        }

        return res;
    }
}
