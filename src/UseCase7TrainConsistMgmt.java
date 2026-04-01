import java.util.*;

class Bogie {
    String id;
    int capacity;

    Bogie(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
}

public class UseCase7TrainConsistMgmt {

    public static void run() {

        System.out.println("=======================================");
        System.out.println("=== USE CASE 7 ===");
        System.out.println("=======================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("General", 90));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("Before Sorting:");
        display(bogies);

        // Sort using Comparator (by capacity)
        Collections.sort(bogies, new Comparator<Bogie>() {
            public int compare(Bogie b1, Bogie b2) {
                return b1.capacity - b2.capacity; // ascending
            }
        });

        System.out.println("\nAfter Sorting (by capacity):");
        display(bogies);

        System.out.println("\nProgram continues...");
    }

    // Display method
    public static void display(List<Bogie> bogies) {
        for (Bogie b : bogies) {
            System.out.println(b.id + " -> Capacity: " + b.capacity);
        }
    }
}