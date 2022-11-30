package additional.addGenerics.computer;

public class Motherboard {
    private String name = "MSI MAG B550 TOMAHAWK AM4";
    private long id = 213453457;
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
