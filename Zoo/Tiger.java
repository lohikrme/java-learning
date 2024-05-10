// Tiger.java
// 10th may 2024

public class Tiger extends Animal {
    private Continents continent;

    Tiger() {
        super("Tigru", Species.TIGER, new Date(1, 1, 2010),210.5, true);
        this.continent = Continents.ASIA;
    }

    Tiger(String name, Species species, Date birth, double weight, boolean female, Continents continent) {
        super(name, species, birth, weight, female);
        this.continent = continent;
    }

    public Continents getContinent() {
        return continent;
    }

    public void setContinent(Continents continent) {
        this.continent = continent;
    }

    public void move() {
        System.out.println("The tiger leaps on its prey...");
    }

    public void utter() {
        System.out.println("GRRR MIAOW NOMNOMNOM!");
    }

    @Override
    public String toString() {
        return super.toString()
        + "Continent: " +  this.continent + ". ";
    }
}
