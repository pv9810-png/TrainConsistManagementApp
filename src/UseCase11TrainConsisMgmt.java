import java.util.*;
import java.util.regex.*;

class TrainInputValidator {

    String trainId;
    String cargoCode;

    TrainInputValidator(String trainId, String cargoCode) {
        this.trainId = trainId;
        this.cargoCode = cargoCode;
    }
}

public class UseCase11TrainConsisMgmt {

    public static void run() {

        System.out.println("=======================================");
        System.out.println("=== USE CASE 11 ===");
        System.out.println("=======================================\n");

        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // Create object
        TrainInputValidator input = new TrainInputValidator(trainId, cargoCode);

        // Regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainRegex = Pattern.compile(trainPattern);
        Pattern cargoRegex = Pattern.compile(cargoPattern);

        // Create matchers
        Matcher trainMatcher = trainRegex.matcher(input.trainId);
        Matcher cargoMatcher = cargoRegex.matcher(input.cargoCode);

        // Validate
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // Display results
        System.out.println("\nValidation Results:");

        if (isTrainValid) {
            System.out.println("Train ID is VALID: " + input.trainId);
        } else {
            System.out.println("Train ID is INVALID: " + input.trainId);
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID: " + input.cargoCode);
        } else {
            System.out.println("Cargo Code is INVALID: " + input.cargoCode);
        }

        System.out.println("\nProgram continues...");
    }

    public static void main(String[] args) {
        run();
    }
}