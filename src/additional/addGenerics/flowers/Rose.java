package additional.addGenerics.flowers;

import additional.addGenerics.api.IBouquet;

public class Rose  implements IBouquet {
    private final String name = "Rose";
    private final String color = "Red";
    private final int date = 5;

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
