/*
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
   let  number = [];
   for ( let i = 0; i < nums.length -1 ; i++ ){
            for (let j = i + 1 ; j < nums.length ; j++){
           if (nums[i] + nums[j] == target){
            number.push(i) ;
            number.push(j) ;
             break;
         }
            }
};
    
        
        
         return number;  
       
            
        }