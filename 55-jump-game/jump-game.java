class Solution {
    public boolean canJump(int[] nums) {

        int i = 0;
        int n = nums.length - 1;
        int f= 0;

        while (i <= f) {

            f= Math.max(f, i + nums[i]);

            if (f >= n) {
                return true;
            }

            i++;
        }

        return false;
    }
}
