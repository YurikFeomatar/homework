package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class Rand {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayRandom(5,100);
        for (int i = 0; i < container.length; i++) {
            System.out.println(container[i]);
        }
    }
}
