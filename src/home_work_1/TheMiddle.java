package home_work_1;
    import java.util.Scanner;

public class TheMiddle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число");
        if(scan.hasNextInt()) {
            int num1 = scan.nextInt();
            System.out.println("Ваше число " + num1);
            System.out.println("Введите второе число");
            if(scan.hasNextInt()) {
                int num2 = scan.nextInt();
                System.out.println("Ваше число " + num2);
                System.out.println("Введите третье число");
                if(scan.hasNextInt()) {
                    int num3 = scan.nextInt();
                    System.out.println("Ваше число " + num3);
                int middle = (num1 > num2)? ((num3 < num2) ? num2 : ((num3 < num1 ) ? num3 : num1 )): ( (num1 > num3 )? num1 :( num2 > num3 ) ? num3 : num2);
                    System.out.println("Среднее число " +middle);
                }else{System.out.println("Введите натуральное число");}
            }else{System.out.println("Введите натуральное число");}
        }else{System.out.println("Введите натуральное число");}
    }
}
