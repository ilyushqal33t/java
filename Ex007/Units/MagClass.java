public abstract class MagClass extends BaseHero {

    int mana;

    public MagClass(int hp, int speed, int damage, int maxDamage, int armor, int mana, String name) {
        super(hp, speed, damage, maxDamage, armor, name);
        this.mana = mana;
    }

}
