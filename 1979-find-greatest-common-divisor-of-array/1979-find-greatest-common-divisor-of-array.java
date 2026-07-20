class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int smallest = nums[0];
        int len = nums.length-1;
        int largest = nums[len];
        int gcd=0;
        for(int i=1;i<=smallest;i++){
            if(smallest%i==0 && largest%i==0)
            gcd=i;
        }
    return gcd;
    }
}