package org.nikitinia.algorithm.twosum;

import java.util.HashMap;

public class SolutionWithArrayAndHashMap {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> mapNums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int remainder = target - nums[i];

            if (mapNums.containsKey(remainder)) {
                return new int[]{mapNums.get(remainder), i};
            } else {
                mapNums.put(nums[i], i);
            }
        }

        throw new IllegalArgumentException("no sum");

    }

}
