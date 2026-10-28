class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     
      int temp = 0;
      int result = 0;
      for( int index =0;index < nums.length;index++){
        
        if(nums[index] == 1){
            temp = temp + 1;
            result = Math.max(temp,result);
        }else{
            temp = 0;
            
        }
   
      }  
    return result;
    }
}