import java.util.*;
import java.util.stream.*;

class Bogiee {
    String id;
    int capacity;

    Bogiee(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
}

public class UseCase8TrainConsistMgmt {

    public static void run() {

        System.out.println("=======================================");
        System.out.println("=== USE CASE 8 ===");
        System.out.println("=======================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("AC Chair", "Passenger", 56));
        bogies.add(new Bogie("General", "Passenger", 90));
        bogies.add(new Bogie("First Class", "Passenger", 40));

        System.out.println("All Bogies:");
        display(bogies);

        // Filter high-capacity bogies (>= 60)
        List<Bogie> highCapacity = bogies.stream()
                .filter(b -> b.capacity >= 60)
                .collect(Collectors.toList());

        System.out.println("\nHigh Capacity Bogies (>= 60):");
        display(highCapacity);

        System.out.println("\nProgram continues...");
    }

    // Display method
    public static void display(List<Bogie> bogies) {
        for (Bogie b : bogies) {
            System.out.println(b.id + " -> Capacity: " + b.capacity);
        }
    }
}