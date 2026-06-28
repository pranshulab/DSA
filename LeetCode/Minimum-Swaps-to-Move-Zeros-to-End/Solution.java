1class Solution {
2    public int minimumSwaps(int[] nums) {
3        int i = 0,
4            j = nums.length - 1;
5        int step = 0;
6        while(i<=j) {
7            if(nums[i] == 0) {
8                if(nums[j] != 0 ) {
9                    int temp = nums[i];
10                    nums[i] = nums[j];
11                    nums[j] = temp;
12                    step++;
13                }
14                else {
15                    j--;
16                }
17            } else {
18                i++;
19            }
20        }
21        return step;
22    }
23}