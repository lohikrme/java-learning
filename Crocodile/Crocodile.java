
public class Crocodile extends Animal {
    private double biteforce;
    
    // constructor
    public Crocodile(double length, double weight, int age,  int hungerTimeMinutes, double biteforce) {
        super(length, weight, age, hungerTimeMinutes);
        this.biteforce = biteforce;
    }

    // class methods
    public void setBiteforce(double biteforce) {
        this.biteforce = biteforce;
    }

    public double getBiteforce() {
        return this.biteforce;
    }

    @Override
    public void makeSound() {
        System.out.println("Splash!");
    }
}
