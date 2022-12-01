package home_work_2.loops;
    import java. util.Scanner;

public class MultiNumber {
    public static void main(String[] args) {
        final MultiNumber mult = new MultiNumber();
        final Scanner scan = new Scanner(System.in);
        System.out.println("Введите целые числа через пробел. 0 вводить нелья.");
        if(scan.hasNextInt()) {
            String number = scan.nextLine();
            if(!number.contains("0")) {
                System.out.println(mult.multiNum(number));
            }else{
                System.out.println("Вы ввели 0. Повторите");
            }
        }else{
            System.out.println("Введены не корректные данные. Вы ввели не число либо вы ввели дробь");
        }
    }

    /**
     * выводит факториал из строки переданную через консоль
     * @param number число в строке
     * @return строку с результатом
     */
    public String multiNum(String number){
        int totalRes = 1;
        String result = "";
        String strArray[] = number.split(" ");
        int numArr[] = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            numArr[i] = Integer.parseInt(strArray[i]);
            if (i < strArray.length -1) {
                result = result + numArr[i] + " * ";
            } else {
                result = result + numArr[i];
            }
            totalRes = totalRes * numArr[i];
        }
        return result + " = " + totalRes;
    }
}

