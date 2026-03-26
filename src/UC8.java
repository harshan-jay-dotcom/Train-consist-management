import java.util.*;
import java.util.stream.Collectors;

public class UC8 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("BG601", "Sleeper", 72));
        bogies.add(new Bogie("BG602", "AC Chair", 54));
        bogies.add(new Bogie("BG603", "First Class", 24));

        // Filter bogies with capacity > 60
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("Filtered Bogies (Capacity > 60):");
        for (Bogie b : filteredBogies) {
            System.out.println(b.type + " -> Capacity: " + b.capacity);
        }

        // Show original list remains unchanged
        System.out.println("\nOriginal List Size: " + bogies.size());
    }
}