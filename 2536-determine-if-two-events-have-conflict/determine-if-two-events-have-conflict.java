class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int result1 = event1[0].compareTo(event2[1]);
        int result2 = event2[0].compareTo(event1[1]);
        if(result1<=0&&result2<=0){
            return true;
        }
        return false;
    }
}