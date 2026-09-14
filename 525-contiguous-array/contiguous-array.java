class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // sum = 0 occurs before the array starts
        map.put(0, -1);

        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {

            // Treat 0 as -1 and 1 as +1
            if (nums[i] == 0) {
                sum--;
            } else {
                sum++;
            }

            // If this sum was seen before,
            // the subarray between them has equal 0s and 1s
            if (map.containsKey(sum)) {
                int length = i - map.get(sum);
                maxLength = Math.max(maxLength, length);
            } else {
                // Store only the FIRST occurrence
                map.put(sum, i);
            }
        }

        return maxLength;
    }
}