class Solution {
    public int scoreOfString(String s) {
        int score =0;
        for(int i=0;i<s.length()-1;i++){
            int val = (int)s.charAt(i);
            int val2=(int)s.charAt(i+1);
            score+=Math.abs(val-val2);
        }
        return score;
    }
}