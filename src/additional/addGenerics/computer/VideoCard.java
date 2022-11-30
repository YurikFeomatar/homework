package additional.addGenerics.computer;

public class VideoCard {
    private String name = "Nvidia GeForce RTX 3070";
    private long id = 12312456;
    private boolean power = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }
}
