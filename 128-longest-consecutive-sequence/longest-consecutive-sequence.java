class Solution {
    public int longestConsecutive(int[] nums) {
        int max_count=0;
        HashSet<Integer> s=new HashSet<>();
        for(int num:nums)
        s.add(num);
    
        for(int num:s)
        {
            if(!s.contains(num-1)){
                int l=1;
                while (s.contains(num+l)){
                l++;
                }
            
            max_count=Math.max(max_count,l);
            }

        }
        return max_count;

    }
}