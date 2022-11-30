package additional.addGenerics.flowers;

import additional.addGenerics.api.IBouquet;

public class Tulip implements IBouquet {
    private final String name = "Tulip";
    private final String color = "Yellow";
    private final int date = 8;

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
