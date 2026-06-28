1class Solution {
2    public int numberOfSteps(int num) {
3        int step = 0;
4
5        while(num>0 ) {
6            if(num % 2 == 0) {
7                num = num/2;
8                step++;
9            }
10            else {
11                num = num - 1;
12                step ++;
13            }
14            
15        }
16        return step;
17    }
18}