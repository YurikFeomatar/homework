package home_work_1;

public class Random {
    public static void main(String[] args) {
        int num =(int) (Math.random()*10);
        int[] array= new int[num];
        System.out.println("Длина массива " + array.length);
    }
}
/**
 * выводим длину массива
 */