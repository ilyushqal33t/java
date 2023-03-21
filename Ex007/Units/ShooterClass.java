import java.util.ArrayList;

public abstract class ShooterClass extends BaseHero{

    int ammo;

    public ShooterClass(int hp, int speed, int damage, int maxDamage, int armor, int ammo, String name, int x, int y) {
        super(hp, speed, damage, maxDamage, armor, name, x, y);
        this.ammo = ammo;
    }

    @Override
    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> friends) {
        if (this.ammo > 0 && this.hp > 0) {
    
            BaseHero target = team.get(0);
            double minDistance = this.position.getDistance(team.get(0));

            for (BaseHero unit : team) {
                if(this.position.getDistance(unit)<minDistance){
                    minDistance = this.position.getDistance(unit);
                    target = unit;
                }
            }

            this.attack(target, this.damage, this.maxDamage);
            this.ammo--;
        }

        for (BaseHero unit : friends) {
            if (unit instanceof Peasant) {      //unit.getName().equals("Peasant")
                this.ammo++;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Осталось стрел: " + String.valueOf(this.ammo);
    }
}
