public abstract class InfantClass extends BaseHero{

    int stamina;

    public InfantClass(int hp, int speed, int damage, int stamina, String name) {
        super(hp, speed, damage, name);
        this.stamina = stamina;
    }

}
