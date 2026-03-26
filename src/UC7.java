import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UC7 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies (using id, type, capacity)
        bogies.add(new Bogie("BG501", "Sleeper", 72));
        bogies.add(new Bogie("BG502", "AC Chair", 54));
        bogies.add(new Bogie("BG503", "First Class", 24));

        // Sort bogies by capacity (ascending)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("Bogies sorted by capacity (ascending):");
        for (Bogie b : bogies) {
            System.out.println(b.type + " -> Capacity: " + b.capacity);
        }
    }
}
