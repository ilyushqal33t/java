public class Priest extends MagClass {

    public Priest(String name, int x, int y) {
        super(360, 254, -35, -45, 40, 300, name, x, y);
    }

    public String getInfo() {
        return "Priest";
    }

    @Override
    public String getName() {
        return "Priest";
    }
}
