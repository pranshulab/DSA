1class Solution {
2    public String reverseWords(String s) {
3         // trim
4         // l, r, s
5         // sb -> s cleaned with multiple spaces to a single space
6         // reverse sb
7         // reverse word by word in sb
8        int l = 0,
9            r = s.length() - 1;
10        // "  the  hello  "
11        //    l
12        //            r
13        // "the hello"
14        while (l < s.length()) {
15            if (s.charAt(l) == ' ') {
16                l = l + 1;
17            } else {
18                break;
19            }
20        }
21        while (r >= 0) {
22            if (s.charAt(r) == ' ') {
23                r = r - 1;
24            } else {
25                break;
26            }
27        }
28        // "  the  hello  "
29        //         l
30        //             r
31        // "the hello"
32        StringBuilder sB = new StringBuilder();
33        while (l <= r) {
34            if (s.charAt(l) != ' ') {
35                sB.append(s.charAt(l));
36                l = l + 1;
37            } else if (s.charAt(l) == ' ') {
38                if (sB.charAt(sB.length() - 1) != ' ') {
39                    sB.append(' ');
40                    l = l + 1;
41                } else {
42                    // ignore
43                    l = l + 1;
44                }
45            }
46        }
47        // sb -> "the hello"
48        //        i
49        //                j
50        // temp = t
51        // reverse
52        int i = 0,
53            j = sB.length() - 1;
54        while (i < j) {
55            char temp = sB.charAt(i);
56            sB.setCharAt(i, sB.charAt(j));
57            sB.setCharAt(j, temp);
58            i = i + 1;
59            j = j - 1;
60        }
61        // "  the  hello  "
62        // sb -> "hello eht"
63        //              s
64        //              e
65        //          1
66        //          2
67        // word by word reverse
68        int start = 0,
69            end = 0;
70        while (start < sB.length()) {
71            while (end < sB.length() && sB.charAt(end) != ' ') {
72                end = end + 1;
73            }
74            int p1 = start,
75                p2 = end - 1;
76            while (p1 < p2) {
77                char temp = sB.charAt(p1);
78                sB.setCharAt(p1, sB.charAt(p2));
79                sB.setCharAt(p2, temp);
80                p1 = p1 + 1;
81                p2 = p2 - 1;
82            }
83            start = end + 1;
84            end = start;
85        }
86        // T: O(n), S: O(n)
87        return sB.toString();
88    }
89}