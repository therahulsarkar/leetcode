/**
 * @param {number[]} nums
 * @return {number[]}
 */
var rearrangeArray = function(nums) {
    let posIndex = 0;
    let negIndex = 1;
    let newArr = new Array(nums.length);

    for(let i = 0; i<nums.length; i++){
        if(nums[i]< 0){
            newArr[negIndex] = nums[i];
            negIndex +=2;
        }else{
            newArr[posIndex] = nums[i];
            posIndex +=2;
        }
    }

    return newArr;
};