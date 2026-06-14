1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     Lish) {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public boolean isPalindrome(ListNode head) {
13        List<Integer> list = new ArrayList<>(); 
14        while(head != null) {
15            list.add(head.val);
16            head = head.next;
17        }
18
19        int  i = 0,
20             j = list.size() - 1;
21
22        while(i<j) {
23            if(list.get(i) != list.get(j)) {
24                return false;
25            }
26            i = i + 1;
27            j = j - 1;
28        }
29        return true;
30    }
31}