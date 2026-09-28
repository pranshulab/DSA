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
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode nodeA = head;
14
15        while(nodeA != null) {
16            ListNode nodeB = nodeA.next;
17            int val = nodeA.val;
18            while(nodeB != null && val == nodeB.val) {
19                nodeB = nodeB.next;
20            }
21            nodeA.next = nodeB;
22            nodeA = nodeB;
23        }
24        return head;
25    }
26}