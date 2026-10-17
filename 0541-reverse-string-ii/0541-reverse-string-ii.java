class Solution {
    public String reverseStr(String s, int k) {
    StringBuilder sb = new StringBuilder(s);
    int i =0;
    while(i<s.length()){
        int start = i;
        int end = Math.min(i+k-1,sb.length()-1);
        while(start<end){
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end,temp);
            start ++;
            end--;
        }
    i = i+ 2*k;
    }

    return sb.toString();
    }
}