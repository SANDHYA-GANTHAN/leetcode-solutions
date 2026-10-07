import java.util.*;

class Solution {
    public int minDeletions(String s) {

        // Count frequency of each character
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Store frequencies that we have already used
        HashSet<Integer> used = new HashSet<>();

        int deletions = 0;

        for (int f : freq) {

            while (f > 0 && used.contains(f)) {
                f--;
                deletions++;
            }

            if (f > 0) {
                used.add(f);
            }
        }

        return deletions;
    }
}