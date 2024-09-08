
import java.util.ArrayList;

class Solution {

    public int[] applyOperations(int[] nums) {
        /*
      Input: nums = [1,2,2,1,1,0]
      Output: [1,4,2,0,0,0]
         */

        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] == nums[i]) {
                nums[i - 1] *= 2;
                nums[i] = 0;
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                arr.add(nums[i]); 
            }
        }

        for (int i = 0; i < n; i++) {
          if (nums[i] == 0) {
              arr.add(nums[i]); 
          }
      }

      int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }
      return result; 
    }
}
