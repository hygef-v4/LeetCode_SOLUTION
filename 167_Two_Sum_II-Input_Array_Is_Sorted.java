import java.util.HashMap;

class Solution {
  public int[] twoSum(int[] numbers, int target) {
      // using 2 pointers 
      int left = 0;
      int right = numbers.length-1; 
      while (left < right){
        int sum = numbers[left] + numbers[right]; 
        if (sum == target){
          return new int[]{left+1, right+1}; 
        }
        else if(sum < target){
          // move the left pointer to the right to increase sum 
          left++; 
        }else {
          // move the right pointer to the left to decrease sum
          right--;  
        }
      }
      return new int[]{}; 
  }
}