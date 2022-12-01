package home_work_2.arrays;

public class ForEach implements Interfacer {
    @Override
    public String runLoopsIter(int[] array) {
        String result = "";
        String text = "\nВыводим итерацию массива при помощи foreach ";
        for (int b : array) {
            result = result + b + " ";
        }
        return text + result;
    }
    public String runLoopsIterOdd(int[] array) {
        String result = "";
        String text = "\nВыводим каждый второй элемент массива при помощи foreach ";
        int x = 0;
        for (int b : array) {
            if (x % 2 == 0) {
                result = result + b + " ";
            }
            x++;
        }
        return text + result;
    }
    public String runLoopsIterBackArray(int[] array) {
        String result = "";
        int b = array.length -1;
        String text = "\nВыводим обратную итерацию массива при помощи foreach ";
        for(int element : array){
            result = result + array[b--] + " ";
        }
        return text + result;
    }
}
