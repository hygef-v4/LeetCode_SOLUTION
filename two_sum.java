import java.util.HashMap;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> Map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      int diff = target - num;
      // if match return the indexes of two numbers
      if (Map.containsKey(diff)) {
        return new int[] { Map.get(diff), i };
      }
      // if dont match then add current num to Map 
      Map.put(num, i);
    }

    return new int[]{};
  }
}