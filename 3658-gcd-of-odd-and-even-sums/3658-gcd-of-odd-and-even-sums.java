class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = 1;
        int even = 2;
        int sumodd =0;
        int sumeven =0;
        for(int i=1;i<=n;i++){
            sumodd = odd + sumodd;
            sumeven= even + sumeven;
            odd = odd+2;
            even = even +2;
        }
        int gcd =0;
        for(int i=1;i<=Math.min(sumodd,sumeven);i++){
            if(sumodd%i==0 && sumeven%i==0){
                gcd = i;
            }
        }
    return gcd;
    }
}