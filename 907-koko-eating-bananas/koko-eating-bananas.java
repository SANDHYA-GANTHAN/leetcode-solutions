class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1,right=0;
        for(int p : piles)
        {
            right=Math.max(right,p);
        }
        while(left<right)
        {
            int mid=(left+right)/2;
            int hour = 0;
            for(int i: piles)
            {
                hour+=(i+mid-1)/mid;
            }
            if(hour<=h)
            {
                right=mid;
            }
            else
            {
                left = mid+1;
            }
        }
        return left;
    }
}