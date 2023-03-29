import java.util.ArrayList;

public abstract class MagClass extends BaseHero {

    int mana;

    public MagClass(int hp, int speed, int damage, int maxDamage, int armor, int mana, String name, int x, int y) {
        super(hp, speed, damage, maxDamage, armor, name, x, y);
        this.mana = mana;
    }

    @Override
    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> friends) {
        if (this.mana > 0 && this.hp > 0) {

            for (BaseHero unit : friends) {
                if (unit.hp > 0 && unit.hp < unit.maxHp) {
                    this.attack(unit, this.damage, this.maxDamage);
                    if (unit.hp > unit.maxHp) {
                        unit.hp = unit.maxHp;
                    }
                    break;
                }
            }
            this.mana--;
        }
    }
}