class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> fList;
        Map<String, List<String>> resultMap = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] currentWordCharArr = strs[i].toCharArray();
            Arrays.sort(currentWordCharArr);
            String sortedString = new String(currentWordCharArr);
            
            resultMap.putIfAbsent(sortedString, new ArrayList());
            resultMap.get(sortedString).add(strs[i]);
        }

        fList = new ArrayList<>(resultMap.values());
        return fList;
    }
}
