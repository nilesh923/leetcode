class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int index =0;
      int temp = 0;
      int result = 0;
      while(index < nums.length){
        
        if(nums[index] == 1){
            temp = temp + 1;
            index= index +1;
            if(temp> result)
            result = result +1;
        }else{
            temp = 0;
            index++;
        }
   
      }  
    return result;
    }
}