package home_work_1;

public class ModulNumber {
    public static void main(String[] args) {
        final ModulNumber modul = new ModulNumber();
        double a = (Math.random() * 11000) -5000;
        System.out.println("Дано число " + a);
        System.out.println(modul.abs(a));
    }
    /**
     * выводит модуль числа
     * @param a число из math.Random
     * @return строку с модулем числа
     */
    public String abs(double a){
        return "Модуль числа = " +Math.abs(a);
    }
}
