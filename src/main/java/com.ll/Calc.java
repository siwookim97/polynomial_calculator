package com.ll;

import java.util.ArrayList;
import java.util.List;

public class Calc {

    public static int run(String exp) {
        exp = exp.replaceAll("- ", "+ -");

        String[] bits = exp.split(" \\+ ");

        int sum = 0;

        for (int i = 0; i < bits.length; i++) {
            sum += Integer.parseInt(bits[i]);
        }

        return sum;
    }
}
