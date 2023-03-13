public class Crossbowman extends ShooterClass {

    public Crossbowman(String name) {
        super(430, 290, 52, 65, 50, 23, name);
    }

    @Override
    public String getInfo() {
        return "Crossbowman ";
    }

    public String sado() {
        return "SniperHero";
    }
}
