import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {

        // Sorting the arrays to simplify the allocation process
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;

        int cookieIndex = 0;
        int childIndex = 0;

        while(childIndex < g.length && cookieIndex < s.length){
            // If the current child can be satisfied with the current cookie
            if(g[childIndex] <= s[cookieIndex]){
                count++;
                // Moving to the next child and cookie
                cookieIndex++;
                childIndex++;
            } else {
                // If the current cookie is not enough for the current child, move to the next cookie bcz next cookie is bigger in size 
                cookieIndex++;
            }
        }
        return count;
    }
}
