class Solution {
  public int[] countBits(int n) {
    int [] arr = new int[n+1]; 
    for (int i = 0; i <= n; i++){
      arr[i] = CountBinary(i); 
    }

    return arr; 
  }

  // change to binary
  // count number of 1

  public int CountBinary(int num) {
    int count = 0;
    for (int i = 31; i >= 0; i--) {
      int val = num >> i;
      if ((val & 1) == 1) {
        count++;
      }
    }
    return count;
  }
}