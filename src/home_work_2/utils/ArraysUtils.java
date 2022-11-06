package home_work_2.utils;

import java.util.Scanner;
import java.util.Random;
public class ArraysUtils {

    /**
     * метод arrayFromConsole создает новый массив, запрашивая с консоли размер и просит его заполнить числами
     * @return возвращает заполненный массив.
     */
    public static int[] arrayFromConsole(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int[] array = new int[scan.nextInt()];
        System.out.println("Заполните массив числами");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }

    /**
     * метод arrayRandom принимает массив с двумя параметрами и возвращает заполненный псевдорандомными числами
     * @param size принимает размер массива
     * @param maxValueExclusion заполняет массив псевдорандомными числами
     * @return возвращает заполненный псевдорандомными числами массив
     */
    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(maxValueExclusion);
        }
        return array;
    }
}
