package additional.addGenerics.game;

public class Zombie {
    private String name = "Zombie";
    private int healts = 30;
    private int damage = 2;
    private int defence = 2;

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

    String voice = "абрфф, абрфф";
}
