class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums1)
        map.put(num,map.getOrDefault(num,0)+1);
        ArrayList<Integer>result=new ArrayList<>();
        for(int x:nums2)
        {
            if(map.getOrDefault(x,0)>0)
            {
                result.add(x);
                map.put(x,map.getOrDefault(x,0)-1);
            }

        }
        int[] ans=new int[result.size()];
        for(int i=0;i<result.size();i++)
        ans[i]=result.get(i);
        return ans;
    }
}