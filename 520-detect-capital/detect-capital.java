class Solution {
   
    public boolean detectCapitalUse(String word) {
        int uppercase = 0;

        for (char ch : word.toCharArray()) {
            if (ch < 'a' || ch > 'z') {
                uppercase++;
            }
        }

        if (uppercase == word.length() || uppercase == 0 || (uppercase == 1 && (word.charAt(0) < 'a' || word.charAt(0) > 'z'))) {
            return true;
        } else {
            return false;
        }

    }
}