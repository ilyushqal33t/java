import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Init {
    public static void createTeams() {
        for (int i = 1; i < Program.GANG_SIZE + 1; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    Program.whiteSide.add(new Acrobat(BaseHero.generateName(), 1, i));
                    break;
                case 1:
                    Program.whiteSide.add(new Magician(BaseHero.generateName(), 1, i));
                    break;
                case 2:
                    Program.whiteSide.add(new Crossbowman(BaseHero.generateName(), 1, i));
                    break;
                default:
                    Program.whiteSide.add(new Peasant(BaseHero.generateName(), 1, i));
                    break;
            }

            switch (new Random().nextInt(4)) {
                case 0:
                    Program.darkSide.add(new Robber(BaseHero.generateName(), 10, i));
                    break;
                case 1:
                    Program.darkSide.add(new Priest(BaseHero.generateName(), 10, i));
                    break;
                case 2:
                    Program.darkSide.add(new SniperHero(BaseHero.generateName(), 10, i));
                    break;
                default:
                    Program.darkSide.add(new Peasant(BaseHero.generateName(), 10, i));
                    break;
            }
        }
    }

    public static void step() {
        ArrayList<BaseHero> list = new ArrayList<>();

        list.addAll( Program.darkSide);
        list.addAll( Program.whiteSide);
        list.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero u1, BaseHero u2) {
                if (u1.getSpeed() == u2.getSpeed()) {
                    return 0;
                } else if (u1.getSpeed() > u2.getSpeed()) {
                    return 1;
                } else
                    return -1;
            }
        });

        for (BaseHero unit : list) {
            if ( Program.darkSide.contains(unit)) {
                unit.step( Program.whiteSide,  Program.darkSide);
            } else
                unit.step( Program.darkSide,  Program.whiteSide);
        }
    }
}
