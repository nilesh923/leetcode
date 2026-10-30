class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0 && nums[i]<=9){
                continue;
            }else if(nums[i]>=10 && nums[i]<=99){
                count = count +1;
            }else if(nums[i]>=100 && nums[i]<=999){
                continue;
            }else if(nums[i]>=1000 && nums[i]<=9999){
                count = count +1;
            }else if(nums[i]==100000){
                count = count+1;
            }else{
                continue;
            }
        }
    return count;
    }
}