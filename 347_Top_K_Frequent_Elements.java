import java.util.HashMap;

class Solution {
  public int[] topKFrequent(int[] nums, int k) {
    // add to the hashmap to count the frequency
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    // learn heap first

    // find first k most frequenly number appear in array
    for (int i = 0; i < k; i++) {

    }
  }
}