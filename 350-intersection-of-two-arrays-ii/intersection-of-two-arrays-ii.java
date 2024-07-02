class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> ansList = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int x=0, y=0;

        while (x<nums1.length && y < nums2.length){
            if(nums1[x] == nums2[y]){
                ansList.add(nums1[x]);
                x++;
                y++;
            } else if(nums1[x] > nums2[y]){
                y++;
            }else{
                x++;
            }
        }
        
       int[] ans = new int[ansList.size()];

       for(int i = 0; i<ansList.size(); i++){
            ans[i] = ansList.get(i);
       }

        return ans;
    }
}