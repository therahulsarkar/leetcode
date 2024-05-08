class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        int n= score.length;
        String[] result = new String[n];
        HashMap<Integer ,Integer> mp = new HashMap<>();
        for(int i =0;i<n;i++){
            mp.put(score[i],i);
        }
        Arrays.sort(score);
        for(int i =n-1;i>=0;i--){
            int athlete =mp.get(score[i]);
            if(i == n-1){
                result[athlete] = "Gold Medal";
            }
            else if(i == n-2){
                 result[athlete] = "Silver Medal";

            }
            else if(i == n-3){
                 result[athlete] = "Bronze Medal";
            }else{
                 result[athlete] = String.valueOf(n -i);
            }
        }
        return result;
    }
}