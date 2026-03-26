import java.util.ArrayList;
import java.util.List;

public class UC2 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<Bogie> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add(new Bogie("BG201", "Sleeper", 72));
        passengerBogies.add(new Bogie("BG202", "AC Chair", 60));
        passengerBogies.add(new Bogie("BG203", "First Class", 48));

        System.out.println("Passenger Bogies after addition:");
        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }

        // Remove AC Chair bogie
        passengerBogies.removeIf(b -> b.type.equals("AC Chair"));

        System.out.println("After removing AC Chair:");
        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }

        System.out.println("Final Passenger Bogies: " + passengerBogies);
    }
}
