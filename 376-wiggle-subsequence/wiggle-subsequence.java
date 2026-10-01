class Solution {
    public int wiggleMaxLength(int[] nums) {

        if (nums.length == 1) {
            return 1;
        }

        int f = 0;
        int c = 1;

        for (int i = 1; i < nums.length; i++) {

            int d = nums[i] - nums[i - 1];

            if (d > 0 && f <= 0) {
                c++;
                f = 1;
            }
            else if (d < 0 && f >= 0) {
                c++;
                f = -1;
            }
        }

        return c;
    }
}