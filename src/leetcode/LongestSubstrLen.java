package leetcode;

import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

public class LongestSubstrLen {

    public static void main(String[] args) {
        String s = "pwwkew";

        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        int maxLen = 0;
        List<Character> list = new LinkedList<>();


        char[] chars = s.toCharArray();


        for (char c : chars) {
            if (list.size() > 0 ) {
                int pos = list.indexOf(c);
                if (pos != -1) {
                    if (list.size() > maxLen) {
                        maxLen = list.size();
                    }
                    list = list.subList(pos + 1, list.size());
                }
            }
            list.add(c);
        }

        return maxLen > list.size() ? maxLen : list.size();
    }

    public static int lengthOfLongestSubstring1(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;
        int start = 0; // 窗口开始位置
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res   = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }
}
