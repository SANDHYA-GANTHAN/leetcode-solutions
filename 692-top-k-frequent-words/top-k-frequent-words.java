import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        // 1. Count frequency of each word
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // 2. Put all unique words into a list
        List<String> list = new ArrayList<>(map.keySet());

        // 3. Sort according to the problem's rules
        list.sort((a, b) -> {

            // Higher frequency comes first
            if (!map.get(a).equals(map.get(b))) {
                return map.get(b) - map.get(a);
            }

            // If frequency is same, lexicographically smaller comes first
            return a.compareTo(b);
        });

        // 4. Take first k words
        return new ArrayList<>(list.subList(0, k));
    }
}