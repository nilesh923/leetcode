class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     //int i =0;
     //int j= i+1;
     int k = nums1.length-2;
     int o = 0;
     for(int i = m;i<nums1.length+1;i++){
        if(o <n){
        nums1[i]= nums2[o];
        o++;
        }
    }
    Arrays.sort(nums1);
    }
   }
