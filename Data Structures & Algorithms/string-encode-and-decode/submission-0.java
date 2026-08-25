class Solution {

    public String encode(List<String> strs) {
        StringBuilder enSb = new StringBuilder();

        for (String s: strs) {
            enSb.append(s.length()).append('#').append(s);
        }

        return enSb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int delimiterIndex = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, delimiterIndex));
            int start = delimiterIndex+1;
            int end = start+length;

            result.add((str.substring(start, end)));
            i = end;
        }
        
        return result;
    }
}
