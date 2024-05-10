// Animal.java
// 10th may 2024

import java.text.DecimalFormat;

abstract public class Animal 
implements Comparable<Animal>{
    private String name;
    private Species species;
    private Date birth;
    private double weight;
    private boolean female;

    // default constructor
    public Animal() {
        this.name = "Haukku";
        this.species = Species.LIZARD;
        this.birth = new Date(1, 1, 2010);
        this.weight = 20.5;
        this.female = true;
    }

    // constructor with parameters
    public Animal (String name, Species species, Date birthDate, double weight, boolean female) {
        this.name = name;
        this.birth = birthDate;
        this.weight = weight;
        this.female = female;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return this.species.toString();
    }

    public void setSpecies(Species sp) {
        this.species = sp;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFemale() {
        return female;
    }

    public void setFemale(boolean female) {
        this.female = female;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.###");
        String weightStr = df.format(this.weight);
        return "Name: " + this.name + ". " 
        + "Species: " + this.species.toString() + ". "
        + "Birthdate: " + this.birth.toString() + ". " 
        + "Weight: " + weightStr + ". " 
        + "Gender: " + (this.female ? "female" : "male") + ". ";
    }

    abstract void move();
    abstract void utter();

    // standard compare method when want to arrange animals by name, birth, weight
    @Override
    public int compareTo(Animal other) {
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        }

        int birthComparison = this.birth.compareTo(other.birth);
        if (birthComparison != 0) {
            return birthComparison;
        }

        return Double.compare(this.weight, other.weight);
    }
}
