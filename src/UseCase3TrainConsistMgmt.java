import java.util.*;

public class UseCase3TrainConsistMgmt {

    public static void run() {

        System.out.println("=======================================");
        System.out.println("=== USE CASE 3 ===");
        System.out.println("=======================================\n");

        Set<String> trainConsist = new HashSet<>();

        trainConsist.add("BG101");
        trainConsist.add("BG102");
        trainConsist.add("BG103");


        boolean isAdded = trainConsist.add("BG101");

        System.out.println("Bogies added successfully!");


        System.out.println("Current Train Consist: " + trainConsist);


        if (!isAdded) {
            System.out.println("Duplicate Bogie ID 'BG101' not allowed!");
        }

        String checkBogie = "BG102";
        if (trainConsist.contains(checkBogie)) {
            System.out.println(checkBogie + " exists in the train.");
        } else {
            System.out.println(checkBogie + " does NOT exist.");
        }

        System.out.println("\nProgram continues...");
    }
}