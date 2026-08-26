class Solution {
    public int firstUniqChar(String s) {
        int sLength = s.length();
        for (int i = 0; i < sLength; i++) {
            boolean isUnique = true;
            for (int j = 0; j < sLength; j++) {
                if (i == j) {
                    continue;
                }
                if (s.charAt(i) == s.charAt(j)) {
                   isUnique = false;
                   break;
                }
            }
            if (isUnique) {
                return i;
            }
        } 
        return -1;
    }
}