import java.util.HashMap;
import java.util.Map;

public class UC6 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogies (type -> capacity)
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 54);
        bogieCapacity.put("First Class", 24);

        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }

        // Optional: create Bogie objects using this map
        Bogie sleeper = new Bogie("BG401", "Sleeper", bogieCapacity.get("Sleeper"));
        Bogie acChair = new Bogie("BG402", "AC Chair", bogieCapacity.get("AC Chair"));
        Bogie firstClass = new Bogie("BG403", "First Class", bogieCapacity.get("First Class"));

        System.out.println("\nBogie Objects:");
        System.out.println(sleeper);
        System.out.println(acChair);
        System.out.println(firstClass);
    }
}
