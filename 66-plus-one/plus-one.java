class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int sum = 0;
      

        for(int i = digits.length-1; i>=0; i--){
            sum = digits[i] + carry;
            if(sum < 10){
                digits[i] = sum;
                return digits;
            } else{
                digits[i] = 0;
                carry = 1;
            }
        }
  
        int[] result = new int[digits.length+1];
        result[0] = 1;
        
        return result;
    }
}