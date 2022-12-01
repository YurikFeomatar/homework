package home_work_2.loops;

public class MultiTable {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final  String ANSI_PURPLE = "\u001B[35m";
    public static final   String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        final MultiTable tabe = new MultiTable();
        tabe.multitab();
    }
    /**
     * метод multiTab описывает и выдает таблицу умножения;
     * таблица разбита на 2 блока.
     * первый выводит умножения от 2 до 5
     * второй - от 6 до 9
     */
    public void multitab(){
        System.out.println(ANSI_GREEN + "\t\t\tТАБЛИЦА\n \t\t\tУМНОЖЕНИЯ");
        System.out.println(ANSI_RESET + "____________________________________________");
        for(int j = 1 ; j <= 10 ; j++) {
            for(int i = 2 ; i <= 5 ; i++) {
                int sum = 0;
                sum += i * j;
                if(j!=10) {
                    System.out.print(i + "x" + j + "= " + sum + "\t\t");
                }else{
                    System.out.print(i + "x" + j + "=" + sum + "\t\t");
                }
            }
            System.out.println();
        }
        System.out.println("____________________________________________");
        for(int j = 1 ; j <= 10 ; j++) {
            for(int i = 6 ; i <= 9 ; i++) {
                int sum = 0;
                sum += i * j;
                if(j!=10) {
                    System.out.print(i + "x" + j + "= " + sum + "\t\t");
                }else{
                    System.out.print(i + "x" + j + "=" + sum + "\t\t");
                }
            }
            System.out.println();
        }
        System.out.println("____________________________________________");
        System.out.println(ANSI_PURPLE + " ЭТО\n НУЖНО\n ЗНАТЬ!");
    }
}
