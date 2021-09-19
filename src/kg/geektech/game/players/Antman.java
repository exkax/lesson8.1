package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Antman extends Hero {
    public Antman(int health, int damage) {
        super(health, damage, SuperAbility.DECREASE);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
switch (RPG_Game.random.nextInt(2)+1){
    case 1:
        setHealth(getHealth()+30);
        setDamage(getDamage()+30);
        System.out.println("Antman увеличился на 30 метров");
        break;
    case 2:
        setHealth(getHealth()-40);
        setDamage(getDamage()-40);
        System.out.println("Antman уменьшился на 40 метров");
}
        System.out.println("AntMan использовал суперспособность ");
    }
}
