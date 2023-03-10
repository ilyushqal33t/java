public abstract class MagClass extends BaseHero{

    int mana;

    public MagClass(int hp, int speed, int damage, int mana, String name) {
        super(hp, speed, damage, name);
        this.mana = mana;
    }


}
