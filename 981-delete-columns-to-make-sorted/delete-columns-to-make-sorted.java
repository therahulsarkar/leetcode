class Solution {
    public int minDeletionSize(String[] strs) {
        int colToDelete = 0;

        for(int col=0; col < strs[0].length(); col++){
            for(int row = 0; row < strs.length-1; row++){
                if(strs[row].charAt(col) - 'a' > strs[row+1].charAt(col) -'a'){
                    colToDelete++;
                    break;
                }
            }
        }
        return colToDelete;
    }
}