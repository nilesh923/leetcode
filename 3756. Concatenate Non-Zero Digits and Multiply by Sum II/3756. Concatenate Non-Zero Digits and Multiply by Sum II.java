class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int[] answer = new int[queries.length]; 
        for (int q = 0; q < queries.length; q++){
            int left= queries[q][0];
            int right = queries[q][1];
            String x = ""; 
            int sum = 0;
            for(int i = left;i<=right;i++){
            int digit = s.charAt(i)-'0';
            if(digit!=0){
                x = x+digit;
                sum = sum + digit;
            }else{
                continue;
            }
        
            }
        int xMod = 0;
        for(int k=0;k<x.length();k++){
            xMod = (int)(((long)xMod * 10 + (x.charAt(k)-'0')) %  1000000007);
        }
        answer[q] =(int)(((long)xMod* sum)%1000000007);
        }
    return answer; 
   }
}
