class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        int [] lps = new int[n];
        int len=0,i=1;
        while(i<n)
        {
            if(s.charAt(i)==s.charAt(len))
            {
                len++;
                lps[i]=len;
                i++;
            }
            else
            {
                if(len!=0)
                {
                    len=lps[len-1];
                }
                else
                {
                    lps[i]=0;
                    i++;
                }
            }
        }
        int repeated = n - lps[n - 1];

        if(lps[n - 1] != 0 && n % repeated == 0)
        {
            return true;
        }

        return false;
    }
}