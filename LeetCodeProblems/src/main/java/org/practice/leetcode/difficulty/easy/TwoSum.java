package org.practice.leetcode.difficulty.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 3, 6, 5, 2}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if(map.containsKey(x)){
                return new int[] {map.get(x),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
