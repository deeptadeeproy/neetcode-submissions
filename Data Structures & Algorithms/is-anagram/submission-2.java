class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length(), tLength = t.length();
        if (sLength != tLength) {
            return false;
        }

        char[] charArrS = s.toCharArray(), charArrT = t.toCharArray();

        Arrays.sort(charArrS);
        Arrays.sort(charArrT);

        if (Arrays.equals(charArrS, charArrT)) {
            return true;
        }

        return false;
    }
}

