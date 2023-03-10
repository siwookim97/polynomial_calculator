package com.ll;

public class Calc {

    public static int run(String exp) {
        String[] nums = exp.split(" ");

        if (nums[1].equals("+")) {
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[2]);

            return a + b;
        } else {
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[2]);

            return a - b;
        }
    }
}
