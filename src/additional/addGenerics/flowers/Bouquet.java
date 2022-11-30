package additional.addGenerics.flowers;

public class Bouquet {
    private Rose flower1;
    private Astra flower2;
    private Tulip flower3;

    /**
     * конструктор принимающий цветы
     * @param flower1 роза
     * @param flower2 астра
     * @param flower3 тюльпан
     */
    public Bouquet(Rose flower1, Astra flower2, Tulip flower3){
        this.flower1 = new Rose();
        this.flower2 = new Astra();
        this.flower3 = new Tulip();
    }

    /**
     * печатает назнания цветов
     * @return названия в строке
     */
    public String printName1(){
        return flower1.getName() + "\n" +   flower2.getName() + "\n" +   flower3.getName();
    }

    /**
     * печатает цвета цветов
     * @return цвет в строке
     */
    public String printColor1(){
        return flower1.getColor() + "\n" +   flower2.getColor() + "\n" +   flower3.getColor();
    }

    /**
     * печатает состояние цветов
     * @return состояние типа String
     */
    public String beforeUse1() {
        return flower1.beforeUse() + "\n" +  flower2.beforeUse() + "\n" +   flower3.beforeUse();
    }
}
