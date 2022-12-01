package home_work_1;

public class RoundCeil {
    public static void main(String[] args) {
        final RoundCeil var = new RoundCeil();
        double a = (Math.random() * 11000)  -5000;
        System.out.println("Дано число вещественного типа : " + a);
        System.out.println(var.mathR(a));

        double c = (Math.random() * 11000) -5000;
        System.out.println("Дано число вещественного типа :" + c);
        System.out.println(var.mathC(c));
    }

    /**
     * округляет дробное число
     * @param a число типа double
     * @return строку с результатом
     */
    public String mathR(double a){
        return "Округление числа a = " + Math.round(a);
    }

    /**
     * округляет дробное число с ближайшему целому
     * @param c число типа double
     * @return строку с результатом
     */
    public String mathC(double c){
        return "Ближайшее число к числу с нулевой дробной частью " + Math.ceil(c);
    }
}
