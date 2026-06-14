1class Solution {
2    public void sortColors(int[] nums) {
3        int i = 0,
4            j = nums.length - 1,
5            k = 0;
6        
7        while(k<=j) {
8            if(nums[k] == 1) {
9                k = k+1;
10            } else if(nums[k] == 2) {
11                int temp = nums[j];
12                nums[j] = nums[k];
13                nums[k] = temp;
14                j = j-1;
15            } else {
16                int temp = nums[i];
17                nums[i] = nums[k];
18                nums[k] = temp;
19                i = i+1;
20                k = k+1;
21            }
22        }
23    }
24}