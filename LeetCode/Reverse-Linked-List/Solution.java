1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12
13    public ListNode reverseList(ListNode head) {
14        ListNode prev = null,
15            curr = head;
16
17        while(curr != null) {
18            // save next
19            ListNode next = curr.next;
20
21            // reverse the current node 
22            curr.next = prev;
23            prev = curr;
24            curr = next;
25        }
26
27        return prev;
28    }
29}