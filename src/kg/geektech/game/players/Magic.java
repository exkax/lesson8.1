package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        switch (RPG_Game.random.nextInt(3)+1){
            case 1:
                for (int i = 0; i < heroes.length; i++) {
                    heroes[i].setDamage(getDamage()+ RPG_Game.random.nextInt(10)+1);
                }
                System.out.println(" Magic использовал суперспособность");
                break;
        }
    }

}
