class Solution {
    public int trailingZeroes(int n) {
        int powerOfFive = 5;
        int ans = 0;

        while(n >= powerOfFive){
            ans = ans + (n/powerOfFive);
            powerOfFive *= 5;
        }

    return ans;
    }
}