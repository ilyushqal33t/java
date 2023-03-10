public class Peasant extends BaseHero {

    

    public Peasant(String name) {
        super(250, 250, 20, name);
    }

    @Override
    public String getInfo(){
        return "Peasant";    
    }

    @Override
    public void step() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }

}
