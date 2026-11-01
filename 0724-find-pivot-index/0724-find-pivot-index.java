class Solution {
    public int pivotIndex(int[] nums) {
        int TotalSum = 0;
        //int count =0;
        for(int num:nums){
            TotalSum = TotalSum + num;
        }
        int left =0;
        for(int i=0;i<nums.length;i++){
            
            int right = TotalSum - nums[i]- left;
            if(left == right){
                return i;
            }else{
                left = left + nums[i];
            }

        }
    return -1;
    }
}