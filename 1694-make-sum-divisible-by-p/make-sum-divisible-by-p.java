class Solution {
    public int minSubarray(int[] nums, int p) {
        int total=0;
        for(int x:nums)
        total=(total+x)%p;

        int need=total;
        if(need==0)return 0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int prefix=0,ans=nums.length;
        for(int i=0;i<nums.length;i++){
            prefix=(prefix+nums[i])%p;
            int r=(prefix-total+p)%p;
            if(map.containsKey(r))
                ans=Math.min(ans,i-map.get(r));
            map.put(prefix,i);
        }
        if(ans==nums.length)
        return -1;

        return ans;
    }
}