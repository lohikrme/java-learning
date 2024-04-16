// Animal.java
// 15th april 2024

abstract public class Animal 
implements Comparable<Animal>{
    private String name;
    private Date birth;
    private double weight;
    private boolean female;

    // default constructor
    public Animal() {
        this.name = "Haukku";
        this.birth = new Date(1, 1, 2000);
        this.weight = 200.5;
        this.female = true;
    }

    // constructor with parameters
    public Animal (String name, Date birthDate, double weight, boolean female) {
        this.name = name;
        this.birth = birthDate;
        this.weight = weight;
        this.female = female;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Name: " + this.name + " " 
        + "Birthdate: " + this.birth.toString() + " " 
        + "Weight: " + Double.toString(this.weight) + " " 
        + "Gender: " + (this.female ? "female" : "male");
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
