package home_work_1;

import java.util.Random;

public class CosSinTanAcosAsinAtan {
    public static void main(String[] args) {
        final CosSinTanAcosAsinAtan triganom = new CosSinTanAcosAsinAtan();
        final Random rand = new Random();
        int ugl = rand.nextInt(360);
        if(ugl >= 0 && ugl <= 360) {
            System.out.println("угол равен = " + ugl);
            System.out.println(triganom.degrees(ugl));
            System.out.println(triganom.sin(ugl));
            System.out.println(triganom.cos(ugl));
            System.out.println(triganom.tan(ugl));
            System.out.println(triganom.asin(ugl));
            System.out.println(triganom.acos(ugl));
            System.out.println(triganom.atan(ugl));
        }else{
            System.out.println("угол не может быть отрицательным");
        }
    }
    /**
     * преобразует радианы в градусы и возвращает значение double типа
     * @param ugl угол
     * @return градусы из радиан в строке
     */
    public String degrees(int ugl){
        return "градусы = " + Math.toDegrees(Math.sin(ugl));
    }
    /**
     * вычисляет синус угла в радианах
     * @param ugl угол
     * @return синус угла в строке
     */
    public String sin(int ugl){
        return "синус " + ugl + " = "+ Math.sin(ugl) + " радиан";
    }
    /**
     * вычисляет косинус угла в радианах
     * @param ugl угол
     * @return косинус угла в строке
     */
    public String cos(int ugl){
        return "косинус " + ugl + " = " + Math.cos(ugl) + " радиан";
    }

    /**
     * вычисляет тангенс угла в радианах
     * @param ugl угол
     * @return тангенс угла в строке
     */
    public String tan(int ugl){
        return "тангенс " + ugl + " = "+ Math.tan(ugl) + " радиан";
    }

    /**
     * вычисляет арксинус из угла в радианах
     * @param ugl угол
     * @return арксинус угла в строке
     */
    public String asin(int ugl){
        return "арксинус " + ugl + " = "+ Math.asin(Math.sin(ugl)) + " радиан";
    }

    /**
     * вычисляет арккосинус угла в радианах
     * @param ugl угол
     * @return арккосинус угла в строке
     */
    public String acos(int ugl){
        return "арккосинус " + ugl + " = "+ Math.acos(Math.cos(ugl)) + " радиан";
    }

    /**
     * вычисляет арктангенс угла в радианах
     * @param ugl угол
     * @return арктангенс угла в строке
     */
    public String atan(int ugl){
        return "арктангенс " + ugl + " = "+ Math.atan(Math.tan(ugl)) + " радиан";
    }
}
