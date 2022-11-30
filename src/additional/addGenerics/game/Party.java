package additional.addGenerics.game;

import additional.addGenerics.api.IParty;

public class Party implements IParty {
    private final Elf gamer1;
    private final Gnom gamer2;
    private final Human gamer3;
    private final Ork gamer4;
    private boolean agr = true;

    /**
     * конструктор принимающий группу персонажей
     * @param gamer1 Эль
     * @param gamer2 Гном
     * @param gamer3 Человек
     * @param gamer4 Орк
     */
    public Party(Elf gamer1, Gnom gamer2, Human gamer3, Ork gamer4){
        this.gamer1 = new Elf();
        this.gamer2 = new Gnom();
        this.gamer3 = new Human();
        this.gamer4 = new Ork();
    }

    /**
     * метод суммирования командного урона
     * @return общий урон типа Int
     */
    @Override
    public int partyDamage() {
        return gamer1.getDamage() + gamer2.getDamage() + gamer3.getDamage() + gamer4.getDamage();
    }

    /**
     * метод агрессии команды
     * @return возвращает булеан значение
     */
    @Override
    public boolean isAgre() {
        return true;
    }
}
