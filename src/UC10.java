import java.util.*;
import java.util.stream.*;

public class UC10 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("BG1001", "Sleeper", 72));
        bogies.add(new Bogie("BG1002", "AC Chair", 54));
        bogies.add(new Bogie("BG1003", "First Class", 24));

        // Calculate total seating capacity using Streams
        int totalSeats = bogies.stream()
                .mapToInt(b -> b.capacity)
                .sum();

        // Display result
        System.out.println("Total Seating Capacity: " + totalSeats);

        // Original list remains unchanged
        System.out.println("Total Bogies: " + bogies.size());
    }
}
// UC10 implementation update