class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;

        int cookieIndex = 0;
        int childIndex = 0;

        while(childIndex < g.length && cookieIndex < s.length){
            if(g[childIndex] <= s[cookieIndex]){
                count++;
                cookieIndex++;
                childIndex++;
            } else{
                cookieIndex++;
            }
        }

        return count;
    }
}