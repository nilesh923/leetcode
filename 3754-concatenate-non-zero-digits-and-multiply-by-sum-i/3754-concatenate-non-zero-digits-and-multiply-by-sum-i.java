class Solution {
    public long sumAndMultiply(int n) {
    String s = String.valueOf(n);
    long m=0;
    long sum =0;
    long x=0;
    for(int i=0;i<s.length();i++){
        int digit = s.charAt(i)-'0';
        if(digit!=0){
            x = (long)(x *10+digit);
            sum = (long)(sum +digit);
            }
        
        }
    m = x*sum;
    return m;
    }
}