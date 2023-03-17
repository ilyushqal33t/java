public class Crossbowman extends ShooterClass {

    public Crossbowman(String name, int x, int y) {
        super(430, 290, 52, 65, 50, 23, name, x, y);
    }

    @Override
    public String getName() {
        return "Crossbowman";
    }
}
