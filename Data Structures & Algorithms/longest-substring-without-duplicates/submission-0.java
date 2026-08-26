class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int l = 0, r = 0, length = 0;

        while (r < s.length()) {
            if (charSet.contains(s.charAt(r))) {
                charSet.remove(s.charAt(l));
                l += 1;
            } else {
                charSet.add(s.charAt(r));
                length = Math.max(length, r - l + 1);
                r += 1;
            }
        }
        return length;
    }
}
