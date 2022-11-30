package additional.addGenerics.runners;

import additional.addGenerics.flowers.Astra;
import additional.addGenerics.flowers.Bouquet;
import additional.addGenerics.flowers.Rose;
import additional.addGenerics.flowers.Tulip;

public class FlowerMain {
    public static void main(String[] args) {
        final Bouquet bouquet = new Bouquet(new Rose(), new Astra(), new Tulip());
            System.out.println("В букете " + bouquet.printName1());
            System.out.println(bouquet.printColor1());
            System.out.println(bouquet.beforeUse1());
    }
}
