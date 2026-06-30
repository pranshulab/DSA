1class Solution {
2    public boolean rotateString(String s, String goal) {
3        String str = s + s;
4
5        if(str.contains(goal)) {
6            return true;  
7        }
8        return false;
9    }
10}