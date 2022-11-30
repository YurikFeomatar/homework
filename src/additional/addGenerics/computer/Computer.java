package additional.addGenerics.computer;

import additional.addGenerics.api.IComputer;

public class Computer implements IComputer {
    private CPU cpu;
    private DDR ddr;
    private HDD hdd;
    private PowerUnit powerUnit;
    private VideoCard videoCard;
    private Motherboard motherboard;
    private boolean powerON = false;

    /**
     * конструктор принимающий в себя составляющие компьютера
     * @param cpu процессор
     * @param ddr оперативная память
     * @param hdd очень жесткий диск
     * @param powerUnit блок питания
     * @param videoCard видеокарта
     * @param motherboard материнская плата
     */
    public Computer(CPU cpu, DDR ddr,HDD hdd, PowerUnit powerUnit, VideoCard videoCard, Motherboard motherboard){
        this.cpu = new CPU();
        this.ddr = new DDR();
        this.hdd = new HDD();
        this.motherboard = new Motherboard();
        this.powerUnit = new PowerUnit();
        this.videoCard = new VideoCard();

    }

    /**
     * включает компьютер и все его составляющие
     * @return возвращает результат включения типа булеан
     */
    @Override
    public boolean PowerOn() {
        cpu.setPower(true);
        ddr.setPower(true);
        hdd.setPower(true);
        powerUnit.setPower(true);
        videoCard.setPower(true);
        motherboard.setPower(true);
        if(cpu.isPower() && ddr.isPower() && hdd.isPower() && powerUnit.isPower() && videoCard.isPower() && motherboard.isPower()){
            powerON = true;
        }
        return powerON;
    }

    /**
     * выключает компьютер и все его составляющие
     * @return результат выклчючения типа булеан
     */
    @Override
    public boolean PowerOFF() {
        powerON = false;
        if(powerON = false){
            cpu.setPower(false);
            ddr.setPower(false);
            hdd.setPower(false);
            powerUnit.setPower(false);
            videoCard.setPower(false);
            motherboard.setPower(false);
        }
        return powerON;
    }
}
