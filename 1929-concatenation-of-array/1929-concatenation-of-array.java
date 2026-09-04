class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int j=0;j<nums.length;j++){
            ans[j]=nums[j];
            ans[j+n]=nums[j];
        }
        return ans;
    }
}