// class Solution {

//     boolean isOdd(int a, int b, int c){
//         if (a % 2 == 0) return false;        
//         else if (b % 2 == 0) return false;
//         else if (c % 2 == 0) return false;
//         else return true;

//     }

//     public boolean threeConsecutiveOdds(int[] arr) {
//         int length = arr.length;
//         int count = 0;

//         for(int i = 0; i<length-2;i++){
//            if(isOdd(arr[i], arr[i+1], arr[i+2])){
//                 count++;
//            }
//         }

//         return count > 0;
//     }
// }

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
    for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 == 1 && arr[i + 1] % 2 == 1 && arr[i + 2] % 2 == 1 ) {
                return true;
            }
        }
        return false;
    }
}