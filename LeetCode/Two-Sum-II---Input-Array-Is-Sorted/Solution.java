1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int i = 0,
4            j = numbers.length - 1;
5
6            while(i<j) {
7            int sum = numbers[i] + numbers[j];
8
9                if(sum>target) {
10                    j = j-1;
11                } else if(sum<target) {
12                    i = i+1;
13                } else {
14                    return new int[]  {
15                    i + 1,
16                    j + 1
17                };
18            }
19        }
20        return new int[] {
21            -1,-1
22        };
23    }
24}