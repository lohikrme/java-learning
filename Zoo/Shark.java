public class Shark extends Animal {
    private SeaAreas sea;

    public Shark() {
        super();
        this.sea = SeaAreas.SARGASSO_SEA;
    }

    public Shark(String name, Date birth, double weight, boolean female, SeaAreas sea) {
        super(name, birth, weight, female);
        this.sea = sea;
    }

    public SeaAreas getSea() {
        return sea;
    }

    public void setSea(SeaAreas sea) {
        this.sea = sea;
    }

    public void move() {
        System.out.println("Shark launches itself from the bottom of ocean towards the unsuspecting victim...");
    }

    public void utter() {
        System.out.println("SPLASH SPLISH BULB BULB SPLASH BITE BITE NONOMNOM!!!");
    }

    @Override
    public String toString() {
        return super.toString() 
        + " Sea-Area: " + this.sea;
    }
}
