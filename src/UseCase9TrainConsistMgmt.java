import java.util.*;
import java.util.stream.*;

class Bogieeee {
    String id;
    String type;
    int capacity;

    Bogieeee(String id, String type, int capacity) {
        this.id = id;
        this.type = type;   // ✅ MUST
        this.capacity = capacity;
    }
}

public class UseCase9TrainConsistMgmt {

    public static void run() {

        System.out.println("=======================================");
        System.out.println("=== USE CASE 9 ===");
        System.out.println("=======================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("AC Chair", "Passenger", 56));
        bogies.add(new Bogie("General", "Passenger", 90));
        bogies.add(new Bogie("Cargo1", "Goods", 120));
        bogies.add(new Bogie("Cargo2", "Goods", 150));

        System.out.println("All Bogies:");
        display(bogies);

        // Group by type
        Map<String, List<Bogie>> grouped = bogies.stream()
                .collect(Collectors.groupingBy(
                        b -> b.type != null ? b.type : "Unknown"
                ));
        // Display grouped result
        System.out.println("\nGrouped Bogies:");
        for (String type : grouped.keySet()) {
            System.out.println("\n" + type + " Bogies:");
            for (Bogie b : grouped.get(type)) {
                System.out.println(b.id + " -> Capacity: " + b.capacity);
            }
        }

        System.out.println("\nProgram continues...");
    }

    // Display method
    public static void display(List<Bogie> bogies) {
        for (Bogie b : bogies) {
            System.out.println(b.id + " (" + b.type + ") -> Capacity: " + b.capacity);
        }
    }
}