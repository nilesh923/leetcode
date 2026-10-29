class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i =0;i<nums.length;i++){
            String temp = String.valueOf(nums[i]);
            if(temp.length() %2 == 0){
                count = count +1;
            }else{
                continue;
            }
        }
    return count;
    }
}