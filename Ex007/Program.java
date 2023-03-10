import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        ArrayList<BaseHero> team1 = new ArrayList<>();
        ArrayList<BaseHero> team2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch(new Random().nextInt(3)){
                case 0:
                    team1.add(new Acrobat(setName()));
                    break;
                case 1:
                    team1.add(new Magician(setName()));
                    break;
                default:
                    team1.add(new Crossbowman(setName()));
                    break;
            }

            switch(new Random().nextInt(3)){
                case 0:
                    team2.add(new Robber(setName()));
                    break;
                case 1:
                    team2.add(new Priest(setName()));
                    break;
                default:
                    team2.add(new SniperHero(setName()));
                    break;
            }
        }



        System.out.println("-------------\n TEAM 1:");
        for (BaseHero unit : team1) {
            System.out.printf(String.format("%s --- ", unit.getInfo()));
            unit.getName();
        }

        System.out.println("-------------\n TEAM 2:");
        for (BaseHero unit2 : team2) {
            System.out.printf(String.format("%s --- ", unit2.getInfo()));
            unit2.getName();
        }

    }

    private static String setName(){
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }
}