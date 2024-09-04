
import java.util.*;

class Solution {

    public int carFleet(int target, int[] position, int[] speed) {
        /*
        Input: target = 12, 
        position = [10,8,0,5,3], 
        speed =    [2,4,1,1,3]
        Output: 3 
         */
        // if ony one car 
        if (position.length == 1) {
            return 1;
        }
        int[][] combine = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            combine[i][0] = position[i];
            combine[i][1] = speed[i];
        }
        // sort asc position 
        Arrays.sort(combine, Comparator.comparingInt(o -> o[0]));
        // add to stack the fleet car 
        Stack<Double> stack = new Stack<>();
        for (int i = combine.length - 1; i >= 0; i--) {
            // find how many time to reach the target 
          double currentTime = (double) (target - combine[i][0] ) / combine[i][1]; 
          if (!stack.empty() && currentTime <= stack.peek()){
            continue; 
          }
          stack.push(currentTime); 
        }
        return stack.size(); 
    }
}
