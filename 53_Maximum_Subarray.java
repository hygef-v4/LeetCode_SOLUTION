class Solution {
  public int maxSubArray(int[] nums) {
    int curSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int num : nums) {
      curSum += num;
      maxSum = Math.max(maxSum, curSum);
      if (curSum < 0) {
        // reset
        curSum = 0;
      }
    }
    return maxSum; 
  }
}