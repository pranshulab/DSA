1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if(s.length() != goal.length()) return false;
4        String str = s + s;
5        return str.contains(goal);
6    }
7}