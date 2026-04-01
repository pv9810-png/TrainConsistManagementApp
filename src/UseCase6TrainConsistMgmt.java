import java.util.*;

public class UseCase6TrainConsistMgmt {

    public static void run() {

        System.out.println("=======================================");
        System.out.println("=== USE CASE 6 ===");
        System.out.println("=======================================\n");

        // HashMap to store bogie and its capacity
        Map<String, Integer> trainMap = new HashMap<>();

        // Add bogies with capacity
        addBogie(trainMap, "BG101", 72);   // Passenger bogie
        addBogie(trainMap, "BG102", 72);
        addBogie(trainMap, "CARGO1", 100); // Load capacity
        addBogie(trainMap, "GUARD", 10);

        // Try duplicate
        addBogie(trainMap, "BG101", 80);

        // Display all bogies with capacity
        System.out.println("\nTrain Bogie Details:");
        for (Map.Entry<String, Integer> entry : trainMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }

        // Get capacity of a specific bogie
        String checkBogie = "BG102";
        if (trainMap.containsKey(checkBogie)) {
            System.out.println("\n" + checkBogie + " capacity: " + trainMap.get(checkBogie));
        }

        // Remove a bogie
        trainMap.remove("CARGO1");
        System.out.println("\nCARGO1 removed.");

        System.out.println("\nFinal Train Map: " + trainMap);

        System.out.println("\nProgram continues...");
    }

    // Helper method
    public static void addBogie(Map<String, Integer> map, String bogie, int capacity) {
        if (!map.containsKey(bogie)) {
            map.put(bogie, capacity);
            System.out.println(bogie + " added with capacity " + capacity);
        } else {
            System.out.println("Duplicate not allowed: " + bogie);
        }
    }
}