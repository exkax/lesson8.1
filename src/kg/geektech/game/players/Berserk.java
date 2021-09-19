package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

import java.util.Random;

public class Berserk extends Hero {
    public Berserk(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        int generatorRandomDamage = RPG_Game.random.nextInt(25) + 1;
        boss.setHealth(boss.getHealth() -getDamage() + generatorRandomDamage );
        System.out.println("Берсерк использовал свою супер способность");

    }

}

