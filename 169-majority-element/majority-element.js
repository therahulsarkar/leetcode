/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let element;
    let count = 0;
    
    for(var i =0; i<nums.length; i++){
        if(count == 0){
            element = nums[i];
            count = 1;
        }
        else if(nums[i] == element){
            count++;
        } else{
            count--;
        }
    }
    
    let check = 0;
    
    for(var i =0; i<nums.length; i++){
        if(nums[i] == element){
            check ++;
        }
        
    }
    if(check > Math.floor(nums.length/2)){
            return element
        } else{
            return -1;
        }
}