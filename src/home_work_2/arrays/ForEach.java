package home_work_2.arrays;

public class ForEach implements Interfacer {
    @Override
    public void runLoops(int[] array) {
        System.out.println("\n\nВыводим итерацию массива при помощи foreach ");
        for (int b : array) {
            System.out.print(b + " ");
        }
        System.out.println("\n\nВыводим каждый второй элемент массива при помощи foreach ");
        int x = 0;
        for (int b : array) {
            if(x% 2 == 0) {
                System.out.print(b + " ");
            }
            x++;
        }
        System.out.println("\n\nВыводим обратную итерацию массива при помощи foreach ");
        int i = 0;
        int[] revArr = new int[array.length];
        i = array.length;
        for (int b : array) {
            i--;
            revArr[i] = b;
        }
        for (int c : revArr) {
            System.out.print(c + " ");
        }
    }
}
