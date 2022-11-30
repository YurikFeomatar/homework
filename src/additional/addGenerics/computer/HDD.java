package additional.addGenerics.computer;

public class HDD {
    private String name = "Seagate Barracuda";
    private long id = 234235767;
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
