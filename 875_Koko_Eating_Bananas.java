import java.util.*; 
class Solution {

  public int minEatingSpeed(int[] piles, int h) {
    int left = 1; 
    int right = 1; 
    for (int p : piles){
      right = Math.max(p, right); 
    }
    // left is min speed
    // right is max speed
    // use binary search to choose suitable speed
    while (left < right){
      int mid = (left + right)/2; 
      int hourSpent = 0; 
      for (int pile : piles) {
        hourSpent += Math.ceil((double) pile / mid);
    }
      // if current speed faster than hour 
      if (hourSpent <= h){
        right = mid; 
      }else{
        // if current speed lower then increase 
        left = mid + 1; 
      }
    }
    return right; 
  }
}
