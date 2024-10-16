package org.practice.leetcode.difficulty.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanValueMap = new HashMap<>();
        romanValueMap.put('I', 1);
        romanValueMap.put('V', 5);
        romanValueMap.put('X', 10);
        romanValueMap.put('L', 50);
        romanValueMap.put('C', 100);
        romanValueMap.put('D', 500);
        romanValueMap.put('M', 1000);

        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int currentVal = romanValueMap.getOrDefault(s.charAt(i),0);
            if (i < n - 1 && currentVal < romanValueMap.get(s.charAt(i + 1))) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }
        return result;

    }
}
