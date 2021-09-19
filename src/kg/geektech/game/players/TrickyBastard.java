package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class TrickyBastard extends Hero{
    public TrickyBastard(int health, int damage) {
        super(health, damage, SuperAbility.CUNNING);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        switch (RPG_Game.random.nextInt(3)+1) {
            case 1:
               setHealth (getHealth() - getHealth());
                System.out.println("TrickyBastard использовал суперспособность");
        }
    }
}
