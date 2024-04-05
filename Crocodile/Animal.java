
import java.util.Timer;
import java.util.TimerTask;

public abstract class Animal {
    private double length;
    private double weight;
    private int age;
    private boolean isHungry;
    private Timer hungerTimer;
    private int hungerTimeMinutes;

    // constructor
    public Animal(double length, double weight, int age, int hungerTimeMinutes) {
        this.length = length;
        this.weight = weight;
        this.age = age;
        this.isHungry = true;
        this.hungerTimeMinutes = hungerTimeMinutes;
        this.hungerTimer = new Timer();
        this.hungerTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                isHungry = true;
            }
        }, 0, (60000 * hungerTimeMinutes));
    }

    // class methods
    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void feed() {
        if (this.isHungry) {
            this.isHungry = false;
            System.out.println("NonNonNom");
        }
    }

    public abstract void makeSound();
}