import java.util.*;
import java.util.stream.Collectors;

public class UC9 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("BG701", "Sleeper", 72));
        bogies.add(new Bogie("BG702", "AC Chair", 54));
        bogies.add(new Bogie("BG703", "Sleeper", 72));
        bogies.add(new Bogie("BG704", "First Class", 24));
        bogies.add(new Bogie("BG705", "AC Chair", 54));

        // Group bogies by type
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.type));

        // Display grouped result
        System.out.println("Grouped Bogies (by type):");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue().size() + " bogies");
        }

        // Original list remains unchanged
        System.out.println("\nOriginal List Size: " + bogies.size());
    }
}
