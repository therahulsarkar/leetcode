class Solution {
    public String reverseWords(String s) {
        Stack<String> str = new Stack<>();
        
        s += " ";
        String tmpStr = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (!tmpStr.isEmpty()) { // Skip consecutive spaces
                    str.push(tmpStr);
                    tmpStr = "";
                }
            } else {
                tmpStr += s.charAt(i);
            }
        }
        
        String ans = "";
        while (!str.isEmpty()) {
            ans += str.pop() + " ";
        }
        return ans.trim();
    }
}