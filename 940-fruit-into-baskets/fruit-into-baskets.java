class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFruits = 0, left = 0, right =0 ;

        while(right < fruits.length){
            map.put(fruits[right], map.getOrDefault(fruits[right],0)+1);

            if(map.size() > 2){
                while(map.size() > 2){
                    map.put(fruits[left], map.getOrDefault(fruits[left],0)-1);
                    if(map.getOrDefault(fruits[left],0) == 0){
                        map.remove(fruits[left]);
                    }
                    left++;
                }
            }
            if(map.size() <= 2){
                maxFruits = Math.max(maxFruits, right-left+1);
            }
            right++;
        }
        return maxFruits;
    }
}