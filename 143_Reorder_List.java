
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

    public void reorderList(ListNode head) {
        // find middle of list using slow and fast pointer approach 
        ListNode slow = head;
        ListNode fast = head.next; 
         while (fast != null && fast.next!= null){
          slow = slow.next; 
          fast = fast.next.next; 
         }
         // now slow is point to middle of list 
         // reverse the second half of the list 
         ListNode second = slow.next; // start of second 
         ListNode prev = null; 
         slow.next = null; // the end of first node 
         // reverse the second list 
         while (second != null){
          ListNode temp = second.next; 
          second.next = prev; 
          prev = second; 
          second = temp; 
         }
         // merge the two lists 
         ListNode first = head; 
         second = prev; 
         while (second != null){
          ListNode tmp1 = first.next; 
          ListNode tmp2 = second.next; 
          first.next = second; 
          second.next = tmp1; 
          first = tmp1; 
          second = tmp2; 
         }
    }
}

  
        
