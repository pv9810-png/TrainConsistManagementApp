import java.util.*;

public class UseCase2TrainConsistMgmt {

    public static void run() {

        System.out.println("=======================================");
        System.out.println("=== USE CASE 1 ===");
        System.out.println("=======================================\n");

        List<String> trainConsist = new ArrayList<>();

        trainConsist.add("Bogie-A");
        trainConsist.add("Bogie-B");
        trainConsist.add("Bogie-C");

        System.out.println("Passenger bogies added successfully!");

        System.out.println("Current Train Consist: " + trainConsist);

        trainConsist.remove("Bogie-B");
        System.out.println("Bogie-B removed.");

        System.out.println("Train Consist after removal: " + trainConsist);

        String checkBogie = "Bogie-A";
        if (trainConsist.contains(checkBogie)) {
            System.out.println(checkBogie + " exists in the train.");
        } else {
            System.out.println(checkBogie + " does NOT exist in the train.");
        }

        System.out.println("\nProgram continues...");
    }
}