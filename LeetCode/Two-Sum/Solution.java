1
2class Solution {
3    public int[] twoSum(int[] nums, int target) {
4        Map<Integer, Integer> map = new HashMap<>();
5        for(int i=0; i<nums.length; i=i+1) {
6            int lookingFor = target - nums[i];
7            if(map.containsKey(lookingFor)) {
8                return new int[] {
9                    i,
10                    map.get(lookingFor)
11                };
12                
13            }
14            map.put(nums[i],i);
15            
16        }
17        return new int[] {
18            -1,-1
19        };
20    }
21}
22