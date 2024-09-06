class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int curr = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                if (curr > 0) {
                    str.append(ch);
                }
                curr++;
            } else if (ch == ')') {
                curr--;
                if (curr > 0) {
                    str.append(ch);
                }

            }
        }

        return str.toString();
    }
}