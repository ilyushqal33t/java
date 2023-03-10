import java.util.Random;
 
public abstract class BaseHero implements Interface{
    protected static Random r;

    protected int hp;
    protected int speed;
    protected int damage;
    protected final String NAME;

    public BaseHero(int hp, int speed, int damage, String name) {
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
        NAME = name;
    }

    @Override
    public void step(){
        System.out.println("Шаг");
    }

    @Override
    public String getInfo(){
        return "---------------";
    }

    public void getName(){
        System.out.println(NAME);
    }
}
