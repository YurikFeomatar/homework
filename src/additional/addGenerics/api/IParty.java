package additional.addGenerics.api;

public interface IParty {
    /**
     * метод общего урона
     * @return общий урон команды
     */
    int partyDamage();

    /**
     * метод агрессии
     * @return агрессивна ли команда
     */
    boolean isAgre();
}
