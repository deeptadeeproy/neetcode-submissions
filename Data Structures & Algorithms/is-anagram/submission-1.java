class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
    
        char[] charArrS = s.toCharArray();
        char[] charArrT = t.toCharArray();
        
        Arrays.sort(charArrS);
        Arrays.sort(charArrT);

        return Arrays.equals(charArrS, charArrT);
    }
}
