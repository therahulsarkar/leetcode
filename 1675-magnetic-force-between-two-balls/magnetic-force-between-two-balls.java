class Solution {


     public boolean possibleSolution(int[] position, int minTaste,int minCandy){
        int candyCount = 1;
        int lastCandy = position[0];
        for(int i = 1; i<position.length; i++){
            if(position[i] - lastCandy >= minTaste){
                candyCount++;
                lastCandy = position[i];
                if(candyCount >= minCandy) return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int length = position.length;
        int low = 0;
        int high = position[length-1] - position[0];
        int ans = 0;

        while(low <= high){
            int mid = (low+high)/2;
            if(possibleSolution(position, mid, m) == true){
                ans = mid;
                low = mid+1;
            } else{
                high = mid -1;
            }
        }
        return ans;
    }
}