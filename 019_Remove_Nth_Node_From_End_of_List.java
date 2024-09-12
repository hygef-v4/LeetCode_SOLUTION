/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode dummyHead = new ListNode(0, head); 
      ListNode slow = dummyHead; 
      ListNode fast = dummyHead; 

      for (int i = 1; i <= n+1; i++){
        fast = fast.next; 
      }
      while (fast != null){
        slow = slow.next; 
        fast = fast.next;   // 1 2 3 4 5 6 7 null
      }                     //         s     f   
      slow.next = slow.next.next;
      return dummyHead.next;  
  }
}