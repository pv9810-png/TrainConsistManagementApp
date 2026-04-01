import java.util.*;

public class UseCase1TrainConsistMgmt {

    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=======================================\n");
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train initialized successfully...");
        System.out.println("Initial number of bogies: " + trainConsist.size());
        System.out.println("Current train consist: " + trainConsist);
        UseCase2TrainConsistMgmt.run();
        UseCase3TrainConsistMgmt.run();
        UseCase4TrainConsistMgmt.run();
        UseCase5TrainConsistMgmt.run();
        UseCase6TrainConsistMgmt.run();
    }
}