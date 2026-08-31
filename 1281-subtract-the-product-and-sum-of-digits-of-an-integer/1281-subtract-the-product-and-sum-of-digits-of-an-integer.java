class Solution {
    public int subtractProductAndSum(int n) {
        int product =1;
        int sum = 0;
        int remaing = n;
        while(remaing >0){
        int p = remaing % 10;
        product = product * p;
        sum = sum + p;
        
        remaing = remaing/10;
        }
        int result = product - sum;
        return result;



    }
}