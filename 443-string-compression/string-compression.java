class Solution {
    public int compress(char[] chars) {
        int write =0;
        int i=0;
        int count;
        while(i<chars.length)
        {
            count=0;
            char ch=chars[i];
            while(i<chars.length &&ch==chars[i])
            {
                count++;
                i++;
            }
            chars[write++]=ch;
            if(count>1)
            {
                String s = Integer.toString(count);
                for(char c : s.toCharArray())
                {
                    chars[write++]=c;
                }
            }
        }
        return write;
    }   
}