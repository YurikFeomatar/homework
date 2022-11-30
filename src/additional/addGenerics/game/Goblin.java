package additional.addGenerics.game;

public class Goblin {
    private String name = "Goblin";
    private int healts = 2000;
    private int damage = 1;
    private int defence = 10;
    private String voice = "ня ня ня ";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealts() {
        return healts;
    }

    public void setHealts(int healts) {
        this.healts = healts;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }


}
