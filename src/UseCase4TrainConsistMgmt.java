import java.util.*;

public class UseCase4TrainConsistMgmt {

    public static void run() {

        System.out.println("=======================================");
        System.out.println("=== USE CASE 4 ===");
        System.out.println("=======================================\n");

        LinkedList<String> trainConsist = new LinkedList<>();

        addBogie(trainConsist, "LOCOMOTIVE");
        addBogie(trainConsist, "BG101");
        addBogie(trainConsist, "BG102");
        addBogie(trainConsist, "CARGO1");
        addBogie(trainConsist, "GUARD");

        addBogie(trainConsist, "BG101");

        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);

        trainConsist.remove("CARGO1");
        System.out.println("\nAfter removing CARGO1:");
        System.out.println(trainConsist);

        System.out.println("\nProgram continues...");
    }

    // Helper method
    public static void addBogie(LinkedList<String> list, String bogie) {
        if (!list.contains(bogie)) {
            list.add(bogie);
            System.out.println(bogie + " added.");
        } else {
            System.out.println("Duplicate not allowed: " + bogie);
        }
    }
}