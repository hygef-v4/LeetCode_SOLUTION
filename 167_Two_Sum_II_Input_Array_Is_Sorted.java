class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0; 
        int fast = numbers.length - 1; 
        while (low < fast) {
            int sum = numbers[low] + numbers[fast]; 
            if (sum > target){ 
                fast--; 
            }else if (sum < target){
                low ++; 
            }else{
                return new int[] {low+1, fast+1}; 
            }
        }
        throw new IllegalArgumentException("Error"); 
    }
}