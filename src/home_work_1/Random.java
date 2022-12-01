package home_work_1;

public class Random {
    public static void main(String[] args) {
        final Random rand = new Random();
        int num =(int) (Math.random()*10);
        System.out.println(rand.array(num));
    }

    /**
     * выводим длину массива с заданным числом
     * @param num число
     * @return строку с длиной масива
     */
    public String array(int num){
        int[] array = new int[num];
        return "Длина массива " + array.length;
    }
}
