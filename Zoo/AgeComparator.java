import java.util.Comparator;

public class AgeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.getBirth().compareTo(a2.getBirth());
    }
}
