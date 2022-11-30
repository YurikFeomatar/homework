package additional.addGenerics.computer;

public class CPU {
    private String name = "Intel Core i9";
    private long id = 123456123;
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
