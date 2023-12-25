class Solution {
    public boolean possibleSolution(int[] price, int minTaste,int minCandy){
        int candyCount = 1;
        int lastCandy = price[0];
        for(int i = 1; i<price.length; i++){
            if(price[i] - lastCandy >= minTaste){
                candyCount++;
                lastCandy = price[i];
                if(candyCount >= minCandy) return true;
            }
        }
        return false;
    }
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int length = price.length;
        int low = 0;
        int high = price[length-1] - price[0];
        int ans = 0;

        while(low <= high){
            int mid = (low+high)/2;
            if(possibleSolution(price, mid, k) == true){
                ans = mid;
                low = mid+1;
            } else{
                high = mid -1;
            }
        }
        return ans;
    }
}