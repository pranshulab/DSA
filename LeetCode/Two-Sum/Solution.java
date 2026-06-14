1
2class Solution {
3    public int[] twoSum(int[] nums, int target) {
4
5        int n= nums.length;
6
7        for(int i=0; i<n-1; i++){
8            for(int j=i+1; j<n; j++){
9
10                if(nums[i] + nums[j] == target){
11                    int ans[] = {i ,j};
12                    return ans;
13                }
14            }
15        }
16
17        int ans[] ={};
18        return ans;
19        
20    }
21}
22