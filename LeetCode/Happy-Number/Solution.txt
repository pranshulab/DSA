1class Solution {
2
3    public int SunOfSqueareOfDigit(int n) {
4        int sum = 0;
5        while(n>0) {
6            int dig = n % 10;
7            sum = sum + (dig * dig);
8            n = n / 10;
9        }
10        return sum;
11    }
12    public boolean isHappy(int n) {
13        int slow = n,
14            fast = n;
15
16        while(fast != 1) {
17            slow = SunOfSqueareOfDigit(slow);
18            fast = SunOfSqueareOfDigit(SunOfSqueareOfDigit(fast));
19            
20            if(fast == 1) {
21                return true;
22            }
23            if(slow == fast) {
24                return false;
25            }
26        }
27        return true;
28    }
29}