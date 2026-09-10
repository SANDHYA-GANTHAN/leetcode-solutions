class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        int k=3;
        for(int i=0;i<=s.length()-k;i++){
            if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i+1)!=s.charAt(i+2) && s.charAt(i)!=s.charAt(i+2))
            count++;

        }
        return count;
    }
}