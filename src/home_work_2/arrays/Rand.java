package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class Rand {
    public static void main(String[] args) {
        final ArraysUtils calc = new ArraysUtils();
        int[] container = calc.arrayRandom(5,100);
        for (int i = 0; i < container.length; i++) {
            System.out.println(container[i]);
        }
    }
}
