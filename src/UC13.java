import java.util.*;
import java.util.stream.Collectors;

public class UC13 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create large dataset of Bogies
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100_000; i++) {
            bogies.add(new Bogie("BG" + (1000 + i), "Sleeper", 72));
            bogies.add(new Bogie("BG" + (2000 + i), "AC Chair", 54));
            bogies.add(new Bogie("BG" + (3000 + i), "First Class", 24));
        }

        // ---------------- LOOP APPROACH ----------------
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ---------------- STREAM APPROACH ----------------
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ---------------- OUTPUT ----------------
        System.out.println("Bogies with capacity > 60 (Loop): " + loopResult.size());
        System.out.println("Bogies with capacity > 60 (Stream): " + streamResult.size());

        System.out.println("Loop Time (ns): " + loopTime);
        System.out.println("Stream Time (ns): " + streamTime);
    }
}

// Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class (for exception demo)
class PassengerBogie {
    String name;
    int capacity;

    PassengerBogie(String name, int capacity) throws InvalidCapacityException {

        // Validate capacity
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.name = name;
        this.capacity = capacity;
    }
}
// UC13 implementation update