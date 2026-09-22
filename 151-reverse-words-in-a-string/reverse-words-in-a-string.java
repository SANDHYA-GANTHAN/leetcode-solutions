class Solution {
    public String reverseWords(String s) {
        String word[]=s.trim().split("\s+");
        String ans=" ";

        for(String a:word){
            ans=a+" "+ans;
        }
        return ans.trim();
    }
}