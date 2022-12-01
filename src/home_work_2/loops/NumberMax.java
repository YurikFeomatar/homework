package home_work_2.loops;
    import java.util.Scanner;
public class NumberMax {
    public static void main(String[] args) {
        final NumberMax calc = new NumberMax();
        final Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое натуральное число и мы покажем max цифру");
        if (scan.hasNextLong()) {
            String number = scan.nextLine();
            int max;
            max = calc.maxValue(String.valueOf(number));
            System.out.println("Максимальное число = " + max);
        } else {
            System.out.println("Вы ввели не число");
            return;
        }
        System.out.println("____________________________________________________________");
        int totalRes = 0;
        System.out.println("Из 1000 чисел четных было = " + calc.vareblNum(totalRes));
        System.out.println("Таким образом, выясняется, что четные числа генерируются примерно 50/50% с нечетными");
        System.out.println("_____________________________________________________________");
        System.out.println("Введите целое натуральное число и мы покажем, сколько четных и нечетных цифр в числе");
        if(scan.hasNextInt()) {
            String number1 = scan.nextLine();
            System.out.println("В числе " + number1 + " четных цифр = " + calc.oddOrEvenNumber(number1, "odd"));
            System.out.println("В числе " + number1 + " нечетных цифр = " + calc.oddOrEvenNumber(number1, "even"));
        }else{
            System.out.println("Вы ввели не число");
            return;
        }
        System.out.println("Введите длину для ряда Фибоначчи");
        if(scan.hasNextInt()) {
            int numberF = scan.nextInt();
            System.out.println(calc.fiboLine(numberF));
        }else{
            System.out.println("Вы ввели не число");
        }
        System.out.println("Начнем наши шаги. Введите точку старта");
        if(scan.hasNextInt()) {
            int startPoint = scan.nextInt();
            System.out.println("Введите точку финиша");
            if(scan.hasNextInt()) {
                int finishPoint = scan.nextInt();
                System.out.println("Введите шаг");
                if(scan.hasNextInt()) {
                    int stepPoint = scan.nextInt();
                    System.out.println(calc.stepToStep(startPoint, finishPoint, stepPoint));
                }else{
                    System.out.println("Вы ввели не число");
                }
            }else{
                System.out.println("Вы ввели не число");
            }
        }else{
            System.out.println("Вы ввели не число");
        }
        System.out.println("\nВведите число, и мы его перевернем");
        if(scan.hasNextInt()) {
            int revNum = scan.nextInt();
            System.out.println("Ваше число " + revNum + " наоборот = " + calc.backNum(revNum));
        }else{
            System.out.println("Вы ввели не число");
        }
    }
    /**
     * метод MaxValue обрабатывает цифры из строки, введенную пользователем.
     * Находит максимальную цифру из числа, по средствам char и преобразует в тип int
     * возвращает int max - значение.
     *
     * @param answer принимает строку
     * @return возвращает максимальное число из заданного в итновом типе.
     */
    public Integer maxValue(String answer) {
        int max = 0;
        for (int i = 0; i < answer.length(); i++) {
            if (max < Character.getNumericValue(answer.charAt(i))) {
                max = Character.getNumericValue(answer.charAt(i));
            }
        }
        return max;
    }

    /**
     * метод VareblNum принимает набор случайных чисел и выводит количество четных из них.
     *
     * @param num1 принимает значение случайных чисел.
     * @return возвращает количество четных чисел.
     */

    public Integer vareblNum(int num1) {
        int totalRes = 0;
        int chi = 1000;
        for (int i = 0; i < chi; i++) {
            int num = (int) (Math.random() * 1000);
            if (num % 2 == 0) {
                totalRes = totalRes + 1;
            }
        }
        return totalRes;
    }
    /**
     * OddOrEvenNumber принимает число введенное пользователем.
     * проверяем каждый символ на четность нечетность, заносим результат в результат.
     * в зависимости от четного или нечетного вызываем вывод метода с флагом odd или even
     *
     * @param answer принимает число
     * @param type   принимает тип odd или even
     * @return результат сложения иттрераций с четными и нечетными числами
     */
    public Integer oddOrEvenNumber(String answer, String type) {
        int result = 0;
        for (int i = 0; i < answer.length(); i++) {
            if (type == "odd") {
                if (Character.getNumericValue(answer.charAt(i)) % 2 == 0 || Character.getNumericValue(answer.charAt(i)) == 0) {
                    result = result + 1;
                }
            }
            if (type == "even") {
                if (Character.getNumericValue(answer.charAt(i)) % 2 != 0) {
                    result = result + 1;
                }
            }
        }
        return result;
    }
    /**
     * метод fiboLine принимает число, и выводит на его основании количество чисел из ряда Фибоначчи.
     *
     * @param numF принимает число, заданное пользователем
     * @return строку с результатом
     */
    public String fiboLine(int numF) {
        String print = "";
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i <= numF; i++) {
            c = a + b;
            a = b;
            b = c;
            if(i < numF) {
                print = print +  c + " ";
            }
        }
        return print + "" + c;
    }
    /**
     * метод stepToStep принимает три значения: начальную точку, конечную точку, и шаг.
     * выдает шаги от старта до финиша.
     * @param start
     * @param finish
     * @param step
     * @return
     */
    public String stepToStep(int start, int finish, int step){
        String print = "";
        while(start < finish){
            if(start + step < finish) {
                start = start + step;
                print = print + start + " ";
            }else {
                print = print + finish;
                start = finish;
            }
        }
        return print;
    }
    /**
     * метод принимает Интовое число, в цикле его переворачивает с помощью другой переменной, в которую  и возвращает числа в обратном порядке в перевернутом виде.
     * @param reverseNum принимает число из консоли
     * @return возвращает перевернутое число
     */
    public Integer backNum(int reverseNum){
        int reverseNumber = 0;
        while(reverseNum != 0){
            reverseNumber = reverseNumber * 10 + reverseNum% 10;
            reverseNum =reverseNum / 10;
        }
        return reverseNumber;
    }
}
