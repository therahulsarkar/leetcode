class Solution {
    public int minOperations(int[] nums) {
        

        Map<Integer, Integer> map = new HashMap();
        int count = 0;
        for(int elem: nums){
            map.put(elem, map.getOrDefault(elem, 0) + 1);
        }


            for(Map.Entry<Integer, Integer> data : map.entrySet()){
                int freq = data.getValue();

                if(freq == 1){
                    return -1;
                } 

                count += freq / 3;
                if(freq % 3 != 0){
                    count++;
                }
            }
        return count;

    }
}