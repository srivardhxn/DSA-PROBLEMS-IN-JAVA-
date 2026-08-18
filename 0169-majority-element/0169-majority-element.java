import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        int majorityThreshold = nums.length / 2;

        for (int num : nums) {
            // Update the count for the current number
            counts.put(num, counts.getOrDefault(num, 0) + 1);
            
            // Check if this number is now the majority element
            if (counts.get(num) > majorityThreshold) {
                return num;
            }
        }
        
        // The problem guarantees a majority element always exists,
        // so this line is technically unreachable.
        return -1; 
    }
}
