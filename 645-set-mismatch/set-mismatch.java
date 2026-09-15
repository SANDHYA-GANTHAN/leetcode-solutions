class Solution {
    public int[] findErrorNums(int[] nums) {
         int i=0;
        List<Integer>list=new ArrayList<>();
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }

        
        else{
            i++;
        }
        }
        int[] res=new int[2];
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
            res[0]=nums[i];
            res[1]=i+1;
            }
            }
        return res;
    }
}