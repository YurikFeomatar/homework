package home_work_2.arrays;
import home_work_2.utils.ArraysUtils;

 import java.util.Scanner;
public class NewArray {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayFromConsole();
        for (int i = 0; i < container.length; i++) {
            System.out.println(container[i]);
        }
    }
}
