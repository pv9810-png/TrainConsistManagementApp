import java.util.*;

public class UseCase10TrainConsistMgmt {
    public static void run() {

        // Use existing Bogie class
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie(50));
        bogies.add(new Bogie(60));
        bogies.add(new Bogie(70));
        bogies.add(new Bogie(80));

        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)   // direct access
                .reduce(0, Integer::sum);
        System.out.println("Total Seating Capacity: " + totalCapacity);
    }

}