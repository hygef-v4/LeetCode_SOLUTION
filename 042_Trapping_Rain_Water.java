class Solution {
  public int trap(int[] height) {
    int n = height.length;
    int[] maxL = new int[n];
    int[] maxR = new int[n];

    int maxLeft = 0;
    int maxRight = 0;
    // store max left
    for (int i = 0; i < n; i++) {
      maxLeft = Math.max(maxLeft, height[i]);
      maxL[i] = maxLeft;
    }
    // store max right
    for (int i = n - 1; i >= 0; i--) {
      maxRight = Math.max(maxRight, height[i]);
      maxR[i] = maxRight;
    }

    int sum = 0;
    for (int i = 0; i < n; i++) {
      int substract = Math.min(maxL[i], maxR[i])
          - height[i];
      if (substract > 0) {
        sum += substract;
      }
    }
    return sum;
  }
}