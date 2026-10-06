class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        
        String temp = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'|| s.charAt(i) >= '0' && s.charAt(i)<= '9'){
                temp = temp + s.charAt(i);
            }else{
                continue;
            }

        }
        int i =0;
        int j= temp.length()- 1;
        while(i<j){
            if(temp.charAt(i) == temp.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        
        
    return true;
    }
}