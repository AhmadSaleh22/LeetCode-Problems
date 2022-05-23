/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {
    let result = -1;
    for(let i = 0 ; i < nums.length ; i++){
        if(nums[i] === target)
            result = i
    }
    return result
};