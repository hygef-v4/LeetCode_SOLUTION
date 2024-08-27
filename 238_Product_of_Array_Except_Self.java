class Solution {
  public int[] productExceptSelf(int[] nums) {
    int[] productArr = new int[nums.length];
    int left = 1; 
    int right = 1 ;
    // loop from left to right to find product lefthand side  
    for (int i = 0; i < nums.length; i++){
      productArr[i] = left; 
      left *= nums[i]; 
    }

    // loop from right to left to find product righthand side 
    for (int i = nums.length-1; i>= 0; i--){
      productArr[i] *= right; 
      right *= nums[i]; 
    }
    return productArr; 
  }

}

