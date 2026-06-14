1class Solution {
2    public int findDuplicate(int[] nums) {
3        int slow = 0,
4            fast = 0;
5        
6        do {
7            slow = nums[slow];
8            fast = nums[nums[fast]];
9
10            if(slow == fast) {
11                break;
12            }
13        } while (slow!=fast);
14        
15        int n1 = 0,
16            n2 = slow;
17            
18        while(n1 != n2) {
19            n1 = nums[n1];
20            n2 = nums[n2];
21        }
22        
23        return n1;
24    }
25}