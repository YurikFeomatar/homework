package additional.addGenerics.flowers;

import additional.addGenerics.api.IBouquet;

public class Astra implements IBouquet {
    private final String name = "Astra";
    private final String color = "Blue";
    private final int date = 1;

    public String getName(){
        return this.name;
    }
    public String getColor(){
        return this.color;
    }
    @Override
    public String beforeUse() {
        String text = "";
        if(date > 7){
            text = "цветок завял";
        }else{
            text = "цветок красив и пахнет";
        }
        return text;
    }
}
