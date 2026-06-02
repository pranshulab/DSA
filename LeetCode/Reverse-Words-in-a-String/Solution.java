1class Solution {
2    public String reverseWords(String s) {
3        String trim = s.trim();
4
5    String[] arr = trim.split("\\s+");
6        int i = 0,
7            j = arr.length - 1;
8        while(i<j) {
9            String temp = arr[i];
10            arr[i] = arr[j];
11            arr[j] = temp;
12            i = i+1;
13            j = j-1;
14        }
15        return String.join(" ", arr);   
16    }
17}