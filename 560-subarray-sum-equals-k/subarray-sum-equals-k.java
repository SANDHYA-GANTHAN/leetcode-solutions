class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int current_sum=0;
        int required=0;
        int count=0;
        for(int x:nums)
        {
            current_sum+=x;
            required=current_sum-k;
            count+=map.getOrDefault(required,0);
            map.put(current_sum,map.getOrDefault(current_sum,0)+1);
        }
        return count;
    }
}