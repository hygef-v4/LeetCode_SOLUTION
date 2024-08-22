class Solution {
  public int findComplement(int num) {
    int mask = (Integer.highestOneBit(num) << 1 ) -1; 
    // get the equal size of 1's mask 
      return num ^ mask; 
  }
}