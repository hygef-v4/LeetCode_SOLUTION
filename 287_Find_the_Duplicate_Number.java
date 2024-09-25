
class Solution {

    public int findDuplicate(int[] nums) {
        // Floyd's Tortoise and Hare (Cycle Detection)
        int slow = nums[0];
        int fast = nums[0];
        // slow = 1   fast = 1 
        // Phase 1: Finding the intersection point of the two runners.
        do {  // 1  3 4 2 2
            slow = nums[slow]; // slow = 2
            fast = nums[nums[fast]];    // fast = 2
        } while (slow != fast);

        // Phase 2: Finding the entrance to the cycle.

        slow = nums[0];   // slow = 1 
        while (slow != fast) {
            slow = nums[slow];  // slow = 2
            fast = nums[fast];  // fast = 2
        }

        return slow;
    }
}
