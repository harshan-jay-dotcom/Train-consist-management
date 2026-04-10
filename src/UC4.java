import java.util.LinkedList;

public class UC4 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        LinkedList<Bogie> train = new LinkedList<>();

        // Add bogies
        train.add(new Bogie("BG101", "Engine", 0));
        train.add(new Bogie("BG102", "Sleeper", 72));
        train.add(new Bogie("BG103", "AC", 60));
        train.add(new Bogie("BG104", "Cargo", 0));
        train.add(new Bogie("BG105", "Guard", 0));

        System.out.println("Initial Train Consist:");
        for (Bogie b : train) {
            System.out.println(b);
        }

        // Insert Pantry at position 2
        train.add(2, new Bogie("BG106", "Pantry", 0));
        System.out.println("\nAfter adding Pantry at position 2:");
        for (Bogie b : train) {
            System.out.println(b);
        }

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();
        System.out.println("\nFinal Train Consist:");
        for (Bogie b : train) {
            System.out.println(b);
        }
    }
}
// UC4 implementation update