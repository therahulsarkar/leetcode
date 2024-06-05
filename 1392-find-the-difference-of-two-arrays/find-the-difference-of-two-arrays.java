class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet();        
        HashSet<Integer> set2 = new HashSet();
        
        ArrayList<Integer> list1 = new ArrayList();        
        ArrayList<Integer> list2 = new ArrayList();

        
        for(int x: nums1){ set1.add(x); }        
        for(int x: nums2){ set2.add(x); }
        
        for(int i : set1){
            if(!set2.contains(i)){
                list1.add(i);
            }
        }
        
         for(int i : set2){
            if(!set1.contains(i)){
                list2.add(i);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        
        answer.add(list1);        
        answer.add(list2);

        return answer;
    }
}