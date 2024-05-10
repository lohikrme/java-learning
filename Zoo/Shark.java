// Shark.java
// 10th may 2024

public class Shark extends Animal {
    private SeaAreas sea;

    public Shark() {
        super("Jaws", Species.SHARK, new Date(1, 1, 2010), 1500, true);
        this.sea = SeaAreas.SARGASSO_SEA;
    }

    public Shark(String name, Species species, Date birth, double weight, boolean female, SeaAreas sea) {
        super(name, species, birth, weight, female);
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
        + "Sea-Area: " + this.sea + ". ";
    }
}
