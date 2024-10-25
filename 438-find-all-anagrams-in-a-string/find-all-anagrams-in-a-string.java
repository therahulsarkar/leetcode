class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        if (p.length() > s.length())
            return res;

        int[] freq_p = new int[26];
        int[] freq_s = new int[26];

        // Freq of each char
        for (int i = 0; i < p.length(); i++) {
            freq_p[p.charAt(i) - 'a']++;
        }

        // window in string2 of size string1
        for (int j = 0; j < p.length(); j++) {
            freq_s[s.charAt(j) - 'a']++;
        }

        if (isSame(freq_p, freq_s))
            res.add(0);

        // Left and right pointer for window
        int right = p.length();
        int left = 0;

        while (right < s.length()) {
            freq_s[s.charAt(right) - 'a']++; // Inc the freq of new char
            freq_s[s.charAt(left) - 'a']--; // Dec the freq of prev char
            if (isSame(freq_p, freq_s)) {
                res.add(right - p.length() + 1);
            }
            // Move both the pointers
            right++;
            left++;
        }
        return res;
    }

    public boolean isSame(int[] freq1, int[] freq2) {
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i])
                return false;
        }
        return true;
    }
}