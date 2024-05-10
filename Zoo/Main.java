// Main.java
// 10th may 2024

import java.util.Collections; // use this with the compareTo interface of Dates and animals
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // set language to be finland, so äöå work also and numbers are formed finnish way
        Locale.setDefault(new Locale("fi", "FI"));

        // test that Date object's basic abilities work
        System.out.println();
        System.out.println("Testing basic methods of Date object...");
        Date date1 = new Date(15, 4, 2024);
        System.out.println(date1.toString());
        date1.setValues(16, 4, 2024);
        System.out.println(date1.toString());
        System.out.println("Basic methods of Date object work!");
        System.out.println();

        // test that Date compareTo works
        System.out.println("Testing compareTo method of Date object...");
        Date date2 = new Date(26, 6, 2023);
        Date date3 = new Date(1, 1, 2024);
        Date date4 = new Date(2, 1, 2024);
        ArrayList<Date> dates = new ArrayList<>();

        dates.add(date1);
        dates.add(date2);
        dates.add(date3);
        dates.add(date4);

        Collections.sort(dates);

        for (Date date : dates) {
            System.out.println(date);
        }

        System.out.println("compareTo method of Date object works!");
        System.out.println();

        // test that Tiger class that inherited Animal class works
        System.out.println("Testing Tiger class...");
        Tiger tiger1 = new Tiger();
        Tiger tiger2 = new Tiger("Tigru", Species.TIGER, date2, 255, false, Continents.ASIA);
        System.out.println("Tiger1: " + tiger1.toString());
        System.out.println("Tiger2: " + tiger2.toString());
        System.out.println(tiger2.getName());
        tiger2.move();
        tiger2.utter();
        System.out.println("Tiger class works as expected!");
        System.out.println();

        // test that also Shark class works which also inherited Animal class
        System.out.println("Testing Shark class...");
        Shark shark1 = new Shark("Hampaaton", Species.SHARK, date3, 1500.2, true, SeaAreas.SOUTH_ATLANTIC_OCEAN);
        System.out.println(shark1.toString());
        shark1.move();
        shark1.utter();
        System.out.println("Shark class works as expected!");
        System.out.println();

        // test that zoo works as expected
        // special focus on ordering by name and ordering by birthdate
        System.out.println("Testing Zoo class...");

        Date date10 = new Date(20, 6, 2001);
        Date date11 = new Date(30, 10, 1999);
        Date date12 = new Date(15, 3, 2010);
        Date date13 = new Date(6, 4, 2004);
        Date date14 = new Date(10, 10, 2015);

        Tiger tiger10 = new Tiger("Öykkäri", Species.TIGER, date10, 350, false, Continents.ASIA);
        Tiger tiger11 = new Tiger("Arttu", Species.TIGER, date11, 250, false, Continents.ASIA);
        Tiger tiger12 = new Tiger("Silja", Species.TIGER, date12, 300.850000001, true, Continents.ASIA);
        Shark shark13 = new Shark("Arttu", Species.SHARK, date13, 750, false, SeaAreas.CARIBBEAN_SEA);
        Shark shark14 = new Shark("Bandit", Species.SHARK, date14, 800, true, SeaAreas.SARGASSO_SEA);

        System.out.println("Animals are created, 3 tigers and 2 sharks.");
        System.out.println("Next we will test, what happens, if i try to insert 2 animals of same name.");
        System.out.println("If 'Arttu' has Sea-Area: CARIBBEAN_SEA, it means that newer Arttu replaced old one");

        Zoo zoo = new Zoo();
        zoo.add(tiger10);
        zoo.add(tiger11);
        zoo.add(tiger12);
        zoo.add(shark13);
        zoo.add(shark14);

        System.out.println();
        System.out.println("Print sorted by name method: ");
        zoo.printSortedByName();
        System.out.println();

        System.out.println("Print sorted by birthdate method: ");
        zoo.printSortedByAge();
        System.out.println();

        System.out.println("Next we will try to add the tiger named 'arttu' again.");
        System.out.println("Ideally add-command returns the info of the shark, ");
        System.out.println("and then tiger named 'Arttu' is found in the list");
        System.out.println(zoo.add(tiger11).toString());
        System.out.println();
        System.out.println("As expected, adding returned the shark named 'Arttu'. Now make sure tiger replaced the shark:");
        zoo.printSortedByName();
        System.out.println();
        System.out.println("As expected, now tiger is inside the zoo, Continent word tells its tiger not shark!");
        
        System.out.println();

        System.out.println("Next trying out if the remove function works properly. Trying to remove the shark named 'Bandit'");
        System.out.println(zoo.remove("Bandit").toString());
        System.out.println("Bandit should we removed, print animals by name");
        zoo.printSortedByName();
        System.out.println();

        System.out.println("Everything looks so far as expected. Therefore, the zoo class and all assisting classes seems to work correctly!");
    }
}
