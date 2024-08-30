import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {

    /**
     * Time Complexity: O(nlog(k))
     * Space Complexity: O(n)
     */
    public int[] topKFrequent(int[] nums, int k) {
      // array to store top k freq 
        int[] arr = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Create a priority queue with custom comparator (min-heap)
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue()); 
        // Maintain top k frequent elements in the priority queue
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
          pq.add(entry); 
          if (pq.size() > k){
            pq.poll(); 
          }
        }

        // Extract elements from the priority queue
        int i = k; 
        while  (!pq.isEmpty()){
          arr[--i] = pq.poll().getKey();  
        }

        return arr;
    }
}
