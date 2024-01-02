import java.util.*;
class Solution{
    public List<List<Integer>> findMatrix(int[] nums) {

        List<List<Integer>> result = new ArrayList();
        Map<Integer, Integer> map = new HashMap<>(); 

        for(int elem : nums){
            map.put(elem, map.getOrDefault(elem, 0)+1);
        }

        while(!map.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            List<Integer> keysToRemove = new ArrayList<>();
            for(Map.Entry<Integer, Integer> data : map.entrySet()){
                temp.add(data.getKey());
                data.setValue(data.getValue()-1);

                if(data.getValue() == 0){
                    keysToRemove.add(data.getKey());
                }
            }

            for(int key: keysToRemove){
                map.remove(key);
            }

            
            result.add(temp);
        }

        return result; 
    }
}