package additional.addGenerics.api;

public interface IComputer {
    /**
     * включает компьютер и все его составляющие
     * @return ответ булеан типа
     */
    boolean PowerOn();

    /**
     * выключает компьютер и все его составляющие
     * @return
     */
    boolean PowerOFF();
}
