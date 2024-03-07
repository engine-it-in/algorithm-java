package org.nikitinia.algorithm.twosum;

import java.util.Arrays;

public class Verification {

    public static void main(String[] args) {

        long[] timeBenchMark = new long[1000000];
        int[] nums = new int[] {2,7,11,15};
        int target = 9;

        int[] resultOfSolutionWithArray = new int[0];
        for (int i = 0; i < 1000000; i ++) {
            long startTime = System.nanoTime();
            resultOfSolutionWithArray = new SolutionWithArray().twoSum(nums, target);
            long endTime = System.nanoTime();
            timeBenchMark[i] = endTime-startTime;
        }

        Double valueBenchMark = Arrays.stream(timeBenchMark).average().getAsDouble();


        System.out.println(Arrays.toString(resultOfSolutionWithArray));
        System.out.println(String.format("Time is -> %4.3f MiliSec", (valueBenchMark)/1_000));


    }
}
