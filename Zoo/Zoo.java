// 7th may 2024

import java.util.Map; // needed for treemap ds
import java.util.TreeMap; // needed for treemap ds
import java.util.Collections; // needed for sorting the animals
import java.util.ArrayList;

public class Zoo {
    private Map<String, Animal> enclosures = new TreeMap<>();

    public Animal add(Animal animal) {
        // IF animal alrdy exists, return the old existing animal no changes
        if(enclosures.containsKey(animal.getName())) {
            return enclosures.get(animal.getName());
        // IF animal not exist, add a new animal
        } else {
            enclosures.put(animal.getName(), animal);
            return null;
        }
    }

    public Animal remove(String nameOfAnimal) {
        Animal a = enclosures.get(nameOfAnimal);
        enclosures.remove(nameOfAnimal);
        return a;
    }

    // returns list of animals ordered by name, date, weight
    private ArrayList<Animal> getOrderedListOfZooAnimals() {
        ArrayList<Animal> animals = new ArrayList<>();
        // Iterating over the elements of the tree map
        for (String key : enclosures.keySet()) {
            animals.add(enclosures.get(key));
        }
        Collections.sort(animals);
        return animals;
    }

    // returns list of animals ordered by date, weight
    public void printSortedByName() {
        ArrayList<Animal> animals = getOrderedListOfZooAnimals();
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
    }

    // sorting by age requires modification from the standard ordering of Animal class
    // instead, we will take the dates from each animal, and use Date objects ordering
    // if date A is larger than Date B, add to list first B then A.
    // repeat this until no changes occur.
    public void printSortedByAge() {
        ArrayList<Animal> animals = new ArrayList<>(enclosures.values());
        Collections.sort(animals, new AgeComparator());
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }    
}
