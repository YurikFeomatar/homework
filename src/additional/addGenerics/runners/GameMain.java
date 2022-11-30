package additional.addGenerics.runners;

import additional.addGenerics.game.*;
public class GameMain {
    public static void main(String[] args) {
        final Party party = new Party(new Elf(),new Gnom(), new Human(), new Ork());
        if(party.isAgre()) {
            {
                Zombie zombie = new Zombie();
                System.out.println("новый монстр :" + zombie.getName());
                System.out.println("Zombie ревет " + zombie.getVoice());
                System.out.println("Жизни " + zombie.getHealts());
                System.out.println("Урон " + zombie.getDamage());
                System.out.println("Защита " + zombie.getDefence());
                System.out.println("Урон группы = " + party.partyDamage());
                if (party.partyDamage() - zombie.getDefence() > zombie.getHealts()) {
                    System.out.println("У Зомби не осталось жизни ");
                    System.out.println("Зобми сдох...а жаль");
                } else {
                    System.out.println("Зомби вас сожрал");
                }
            }
            {
                Goblin goblin1 = new Goblin();
                System.out.println("новый монстр : " + goblin1.getName());
                System.out.println("Гоблин кричит " + goblin1.getVoice());
                goblin1.setHealts(100);
                System.out.println("Жизни " + goblin1.getHealts());
                System.out.println("Урон " + goblin1.getDamage());
                System.out.println("Защита " + goblin1.getDefence());
                System.out.println("Урон группы = " + party.partyDamage());
                if (party.partyDamage() - goblin1.getDefence() > goblin1.getHealts()) {
                    System.out.println("У Зоблина не осталось жизни ");
                    System.out.println("Гоблин сдох...а жаль");
                } else {
                    System.out.println("Гоблин отколотил вас палкой");
                }
            }
            {
                Goblin goblinBoss = new Goblin();
                System.out.println("новый монстр : " + goblinBoss.getName());
                System.out.println("Гоблин-Босс кричит " + goblinBoss.getVoice());
                System.out.println("Жизни " + goblinBoss.getHealts());
                System.out.println("Урон " + goblinBoss.getDamage());
                System.out.println("Защита " + goblinBoss.getDefence());
                System.out.println("Урон группы = " + party.partyDamage());
                int healts = 0;
                healts = healts + goblinBoss.getHealts();
                while (healts > 0) {
                    healts = healts - (party.partyDamage() - goblinBoss.getDefence());
                    System.out.println("у Гоблина-Босса осталось жизней " + healts);
                }
                System.out.println("Гоблина-Босса послали на небо за звездочками");
            }
        }
    }
}
