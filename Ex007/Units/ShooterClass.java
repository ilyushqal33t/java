public abstract class ShooterClass extends BaseHero{
    
    int ammo;

    public ShooterClass(int hp, int speed, int damage, int ammo, String name) {
        super(hp, speed, damage, name);
        this.ammo = ammo;
    }

}
