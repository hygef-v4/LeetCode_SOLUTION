/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    // dummy node
    final ListNode root = new ListNode();
    ListNode prev = root;
    // check if linked list not empty
    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        prev.next = list1;
        list1 = list1.next; // linked list point to next value
      } else {
        prev.next = list2;
        list2 = list2.next;
      }
      // move pointer to next node 
      prev = prev.next; 
    }
    // if one of list is empty -> point to the other list
    prev.next = list1 == null ? list2 : list1;
    // return merged linked list
    return root.next;
  }
}
