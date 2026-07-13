class Solution {
    public String processStr(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                if (!result.isEmpty()) {
                result = result.substring(0, result.length() - 1);
            }} else if (s.charAt(i) == '#') {
                String temp = result + result;
                result = temp;

            } else if (s.charAt(i) == '%') {
                String rev = "";
                for (int j = result.length() - 1; j >= 0; j--) {
                    rev += result.charAt(j);
                }
                result= rev;

            }else{
                result = result + s.charAt(i);
            }
        }
    return result;
    }
}