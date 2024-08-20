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
  public ListNode middleNode(ListNode head) {
      // using slow, fast pointer algorithm
      // fase poiter have speed rate of 2 node, and slow is one node
      // when fast pointer reach the end then the slow pointer reach the middle of the list 

      ListNode fast = head; 
      ListNode slow = head; 

      while(fast != null && fast.next != null){
        fast = fast.next.next;  
        slow = slow.next; 
      }
      //return node in the midddle 
      return slow; 
  }
}