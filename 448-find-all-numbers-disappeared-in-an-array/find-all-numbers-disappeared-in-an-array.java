class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

    HashSet<Integer>s=new HashSet<>();
    List<Integer>l=new ArrayList<>();
    for(int num:nums){
        s.add(num);
    }
    for(int i=1;i<=nums.length;i++){
        if(!s.contains(i))
            l.add(i);
    }
    return l;
    }
    
    
}