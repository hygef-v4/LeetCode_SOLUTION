
class Solution {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
            // find min index 
        }
        int minIndex = left;
        if (minIndex == 0) {   // means that the array is in right order 
            left = 0;
            right = nums.length - 1;
        } else if (target >= nums[0] && target <= nums[minIndex - 1]) {
            // if in range to the left 
            left = 0; 
            right = minIndex-1;
        }else {
            left = minIndex; 
            right = nums.length-1; 
        }
        
        // binary search in selected range 
        while(left <= right){
            int mid = (left + right)/2;
            if (nums[mid] == target){
                return mid; 
            }else if (nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1; 
    }
}

// 4,5,6,7,0,1,2    target = 6

// mid > right means rotate      target < mid 
