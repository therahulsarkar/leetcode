class Solution {
    public int maxArea(int[] height) {
        int maxWater  = 0;
        int i = 0;
        int j = height.length - 1;

        while(i<j){
            int volume = Math.min(height[i], height[j]) * (j-i);
            maxWater = Math.max(maxWater, volume);

            if(height[i] > height[j]){
                j--;
            } else{
                i++;
            }
        }
        return maxWater;
    }
}