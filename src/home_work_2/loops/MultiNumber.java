package home_work_2.loops;
    import java. util.Scanner;

public class MultiNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целые числа через пробел. 0 вводить нелья.");
        if(scan.hasNextInt()) {
            String number = scan.nextLine();
            if(!number.contains("0")) {
                int totalRes = 1;
                String strArray[] = number.split(" ");
                int numArr[] = new int[strArray.length];
                for (int i = 0; i < strArray.length; i++) {
                    numArr[i] = Integer.parseInt(strArray[i]);
                    if (i < strArray.length -1) {
                        System.out.print(numArr[i] + " * ");
                    } else {
                        System.out.print(numArr[i]);
                    }
                    totalRes = totalRes * numArr[i];
                }
                System.out.println(" = " + totalRes);
            }else{
                System.out.println("Вы ввели 0. Повторите");
            }
        }else{
            System.out.println("Введены не корректные данные. Вы ввели не число либо вы ввели дробь");
        }
    }
}

