import java.util.Arrays;

class Solution {
  public int longestConsecutive(int[] nums) {

    if (nums.length == 0) {
      return 0;
    }

    int[] count = new int[nums.length];
    Arrays.fill(count, 1);

    int[] newArr = Arrays.copyOf(nums, nums.length);
    Arrays.sort(newArr);

    int countIndex = 0;

    for (int i = 0; i < newArr.length - 1; i++) {

      if (newArr[i + 1] - newArr[i] == 1) {
        count[countIndex]++;
      } else if (newArr[i + 1] != newArr[i]) { // Skip duplicates
        countIndex++;
      }

    }
    Arrays.sort(count);
    int max = count[count.length - 1];
    return max;
  }
}