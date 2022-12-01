package home_work_2.arrays;

public class While implements Interfacer {
    public String runLoopsIter(int[] array) {
        String result = "";
        String text = "\nВыводим итерацию массива при помощи while ";
        int i = 0;
        while (array.length > i) {
            result = result + array[i] + " ";
            i++;
        }
        return text + result;
    }
    public String runLoopsIterOdd(int[] array) {
        String result = "";
        String text = "\nВыводим каждый второй элемент массива при помощи while ";
        int i = 0;
        while (array.length > i) {
            if (i % 2 == 0) {
                result = result + array[i] + " ";
            }
            i++;
        }
        return text + result;
    }
    public String runLoopsIterBackArray(int[] array) {
        String result = "";
        String text = "\nВыводим обратную итерацию массива при помощи while ";
        int i = array.length -1;
        while (i >= 0) {
            result = result + array[i] + " ";
            i--;
        }
        return text + result;
    }
}
