class Solution {
    public int pivotIndex(int[] nums) {
    int m=0;
    
    while(m != nums.length){
    int right =0;
    int left =0;
    for(int i=m;i<nums.length-1;i++){
        right = nums[i+1]+ right;
    }
    for(int j=m;j>0;j--){
        if(j==0)
        break;

        left = nums[j-1]+left;
    }
    if(left == right){
        return m;
    }else{
        m++;
    }
    }
    return -1;}
}