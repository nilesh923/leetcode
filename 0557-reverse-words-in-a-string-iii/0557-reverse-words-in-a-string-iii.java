class Solution {
    public String reverseWords(String s) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < s.length()) {
            sb.append(s.charAt(i));
            i++;
        }
        int start = 0;
        int end = 0;
        while (start < sb.length()) {
            while (end < sb.length() && sb.charAt(end) != ' ') {
                end++;

            }
            int pt1 = start, pt2 = end - 1;
            while (pt1 < pt2) {
                char temp = sb.charAt(pt1);
                sb.setCharAt(pt1, sb.charAt(pt2));
                sb.setCharAt(pt2, temp);
                pt1++;
                pt2--;
            }
            start = end + 1;
            end = start;
        }

        return sb.toString();
    }
}