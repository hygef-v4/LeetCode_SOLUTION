import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    // sort the value
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      // if number is positive then end
      if (nums[i] > 0) {
        break;
      } else if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      int low = i+1;
      int high = nums.length - 1;
      while (low < high) {
        int sum = nums[i] + nums[low] + nums[high];
        if (sum == 0) {
          list.add(Arrays.asList(nums[i], nums[low], nums[high]));
          low++;
          high--;

          while (low < high && nums[low] == nums[low - 1]) {
            low++;
          }
          while (low < high && nums[high] == nums[high + 1]) {
            high--;
          }
        } else if (sum < 0) {
          // increase low
          low++;
        } else {
          // decrease high
          high--;
        }
      }
    }
    return list;
  }
}