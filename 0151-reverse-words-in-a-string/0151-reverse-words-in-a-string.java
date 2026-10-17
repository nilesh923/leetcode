class Solution {
    public String reverseWords(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < s.length() ) {
            if (s.charAt(i) == ' ') {
                i++;
            }else{
                break;
            }
        }
        while(j>= 0){
            if(s.charAt(j)==' '){
                j--;
            }else{
                break;
            }
        }
        StringBuilder ss = new StringBuilder();
        while (i <= j) {
            if (s.charAt(i) != ' ') {
                ss.append(s.charAt(i));
                i++;
            } else if (s.charAt(i) == ' ') {
                if (ss.charAt(ss.length() - 1) != ' ') {
                    ss.append(' ');
                    i++;
                } else {
                    i++;
                }
            }
        }
        int m = 0;
        int n = ss.length() - 1;
        while (m < n) {
            char temp = ss.charAt(m);
            ss.setCharAt(m, ss.charAt(n));
            ss.setCharAt(n, temp);
            m++;
            n--;

        }
        int start = 0, end = 0;
        while (start < ss.length()) {
            while (end < ss.length() && ss.charAt(end) != ' ') {
                end++;
            }
            int pt1 = start, pt2 = end-1;
            while (pt1 < pt2) {
                char temp = ss.charAt(pt1);
                ss.setCharAt(pt1, ss.charAt(pt2));
                ss.setCharAt(pt2, temp);
                pt1++;
                pt2--;

            }
            start = end + 1;
            end = start;
        }

        return ss.toString();
    }
}