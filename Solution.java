/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
  public boolean hasCycle(ListNode head) {
    // tortoise and hare algorithm to detect whether a linked list has cycle
    // declare fast and slow pointer
    ListNode fast = head;
    ListNode slow = head;
    
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow) {
        sout("Cycle detected");
        return true;
      }

    }

    return false;
  }
}