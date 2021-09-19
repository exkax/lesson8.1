package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero {


    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.STUNNING);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        switch (RPG_Game.random.nextInt(3) + 1) {
            case 1:
                boss.setDamage(boss.getDamage()- boss.getDamage());

        }
    }

}
