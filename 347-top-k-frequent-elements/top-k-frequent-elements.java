import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr = new int[k];
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer>l=new ArrayList<>(map.keySet());
        Collections.sort(l,(a,b)->map.get(b)-map.get(a));
        int[] res=new int[k];
        for(int i=0;i<k;i++)
        res[i]=l.get(i);
        return res;
    }
}