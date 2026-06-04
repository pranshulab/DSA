1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        ListNode slow = head,
15                fast = head;
16        while(fast!= null && fast.next != null) {
17            slow = slow.next;
18            fast = fast.next.next;
19            if(slow == fast) {
20                break;
21            }
22        }
23        if(fast == null || fast.next == null) {
24            return null;
25        }
26
27        ListNode n1 = slow,
28                n2 = head;
29        while(n1 != n2) {
30            n1 = n1.next;
31            n2 = n2.next;
32        }
33        return n1;
34
35    }
36}