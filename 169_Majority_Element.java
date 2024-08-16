import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
  public int majorityElement(int[] nums) {
    int length = nums.length;
    HashMap<Integer, Integer> fregCount = new HashMap<>();
    for (int num : nums) {
      fregCount.put(num, fregCount.getOrDefault(num, 0) + 1);
    }

    for (Map.Entry<Integer, Integer> entry : fregCount.entrySet()) {
      if (entry.getValue() > length / 2) {
        return entry.getKey(); 
      }
    }
    return -1; 
  }

}