class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0;
        int prevCount = 0;
        for(String s: bank){
            int currCount = 0;
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i) == '1'){
                    currCount ++;
                }
            }

            if(currCount > 0){
                ans += prevCount * currCount;
                prevCount = currCount;
            }
        }
        return ans;
    }
}