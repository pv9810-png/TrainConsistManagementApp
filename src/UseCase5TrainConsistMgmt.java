import java.util.*;

public class UseCase5TrainConsistMgmt {

    public static void run() {

        System.out.println("=======================================");
        System.out.println("=== USE CASE 5 ===");
        System.out.println("=======================================\n");

        // LinkedHashSet maintains order + uniqueness
        Set<String> trainConsist = new LinkedHashSet<>();

        // Add bogies
        addBogie(trainConsist, "LOCOMOTIVE");
        addBogie(trainConsist, "BG101");
        addBogie(trainConsist, "BG102");
        addBogie(trainConsist, "CARGO1");
        addBogie(trainConsist, "GUARD");

        // Try duplicate
        addBogie(trainConsist, "BG101");

        // Display train
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);

        // Remove a bogie
        trainConsist.remove("CARGO1");
        System.out.println("\nAfter removing CARGO1:");
        System.out.println(trainConsist);

        // Check existence
        if (trainConsist.contains("BG102")) {
            System.out.println("\nBG102 exists in the train.");
        }

        System.out.println("\nProgram continues...");
    }

    // Helper method
    public static void addBogie(Set<String> set, String bogie) {
        if (set.add(bogie)) {
            System.out.println(bogie + " added.");
        } else {
            System.out.println("Duplicate not allowed: " + bogie);
        }
    }
}