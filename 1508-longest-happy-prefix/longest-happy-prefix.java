class Solution {
    public String longestPrefix(String s) {
        int[] lps = new int[s.length()];
        int n=s.length();

        int len = 0;
        int k = 1;

        while (k < s.length()) {

            if (s.charAt(k) == s.charAt(len)) {
                len++;
                lps[k] = len;
                k++;
            }
            else {
                if (len != 0) {
                    len = lps[len - 1];
                }
                else {
                    lps[k] = 0;
                    k++;
                }
            }
        }
        return s.substring(0,lps[n-1]);
    }
}