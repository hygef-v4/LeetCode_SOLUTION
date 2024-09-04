import java.util.*;

class Solution {

    public int largestRectangleArea(int[] heights) {
        int area = 0;
        int n = heights.length;
        int start; 
        Stack<Pair<Integer, Integer>> stack = new Stack<>();

        for (int i = 0; i < heights.length; i++) {
            int curHeight = heights[i]; 
            start = i; 
            while (!stack.isEmpty() && stack.peek().getValue() > curHeight){
                Pair<Integer, Integer> pair = stack.pop();  // Fixed the typo here
                int index  = pair.getKey(); 
                int h = pair.getValue(); 
                area = Math.max(area, h * (i - index)); 
                start = index; 
            }
            stack.push(new Pair<>(start, curHeight));
        }

        while (!stack.isEmpty()){
            Pair<Integer, Integer> pair = stack.pop();
            int index = pair.getKey();
            int h = pair.getValue();
            area = Math.max(area, h * (n - index));
        }

        return area; 
    }
}
