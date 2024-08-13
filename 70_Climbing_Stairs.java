class Solution {
  public int climbStairs(int n) {
    if (n == 1) {
        return 1;
    }
    int first = 1;
    int second = 2; 
    for (int i = 1; i <= n-2; i++) {
      int third = first + second; 
      first = second; 
      second = third;
    }
    return second;
  }
}
