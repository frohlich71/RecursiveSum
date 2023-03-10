package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        List<Integer> nums = List.of(4, 4);
        ArrayList<Integer> temp = new ArrayList<>(nums);
        Integer sum = 0;

        System.out.println(solution.recursiveSum(temp, sum));


    }
}

class Solution {

    public int recursiveSum (ArrayList<Integer> nums, Integer sum) {

        if (nums.size() == 1) {
            return sum + nums.get(0);
        } else {
            int removed = nums.remove(nums.size() - 1);
            sum = recursiveSum(nums, sum) + removed;
            return sum;
        }

    }

}