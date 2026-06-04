1class Solution {
2    public int findDuplicate(int[] nums) {
3        Set<Integer> set = new HashSet<>();
4
5        for(int num : nums) {
6            if(set.contains(num)) {
7                return num;
8            }
9            set.add(num);
10        }
11
12        return -1;
13    }
14}