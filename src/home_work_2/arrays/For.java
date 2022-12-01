package home_work_2.arrays;

public class For implements Interfacer {
    public String runLoopsIter(int[] array) {
        String result = "";
        String text = "\nВыводим итерацию массива при помощи for ";
        for (int i = 0; i < array.length; i++) {
            result = result + array[i] + " ";
        }
        return text + result;
    }
    public String runLoopsIterOdd(int[] array) {
        String result = "";
        String text = "\nВыводим каждый второй элемент массива при помощи for ";
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                result = result + array[i] + " ";
            }
        }
        return text + result;
    }
    public String runLoopsIterBackArray(int[] array) {
        String result = "";
        String text = "\nВыводим обратную итерацию массива при помощи for ";
        for (int i = array.length-1; i >= 0; i--) {
            result = result + array[i] + " ";
        }
        return text + result;
    }
}
