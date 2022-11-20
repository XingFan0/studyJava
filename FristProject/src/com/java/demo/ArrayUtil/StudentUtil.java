package com.java.demo.ArrayUtil;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {

    }

    public static int getMaxAge(ArrayList<Student> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i).getAge();
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
