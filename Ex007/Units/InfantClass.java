public abstract class InfantClass extends BaseHero {

    int stamina;

    public InfantClass(int hp, int speed, int damage, int maxDamage, int armor, int stamina, String name) {
        super(hp, speed, damage, maxDamage, armor, name);
        this.stamina = stamina;
    }
}
