class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = 0;
        int timeNeeded = 0;
        int currentMaxIndex = 0;
        for(int i = 0; i<releaseTimes.length; i++){
            if(i == 0){
              timeNeeded = releaseTimes[i];
            }else{
            timeNeeded = releaseTimes[i]-releaseTimes[i-1];
            }
            if(timeNeeded > max || (timeNeeded == max && keysPressed.charAt(i) > keysPressed.charAt(currentMaxIndex))){
                currentMaxIndex = i;
                max = timeNeeded;
            }
        }

        return keysPressed.charAt(currentMaxIndex);
    }
}