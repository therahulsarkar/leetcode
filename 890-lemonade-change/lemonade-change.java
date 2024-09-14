class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0;
        int tenCount = 0;
        int twentyCount = 0;

        for(int i =0; i<bills.length; i++){
            if(bills[i] == 5){
                fiveCount++;
            } else if(bills[i] == 10){
                tenCount++;
                if(fiveCount < 1){
                    return false;
                }
                fiveCount--; 
            } else if(bills[i] == 20){
                twentyCount++;
                if(tenCount >0 && fiveCount > 0){
                    tenCount--;
                    fiveCount--;   
                } else if(fiveCount > 2){
                    fiveCount-= 3;
                } else{
                    return false;
                }
            }
        }

        return true;
    }
}