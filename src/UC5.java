import java.util.LinkedHashSet;

public class UC5 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        LinkedHashSet<Bogie> train = new LinkedHashSet<>();

        train.add(new Bogie("BG101", "Engine", 0));
        train.add(new Bogie("BG102", "Sleeper", 72));
        train.add(new Bogie("BG103", "Cargo", 0));
        train.add(new Bogie("BG104", "Guard", 0));
        train.add(new Bogie("BG102", "Sleeper", 72)); // duplicate ignored

        System.out.println("Train Formation (Ordered & Unique):");
        for (Bogie b : train) {
            System.out.println(b);
        }
    }
}
// UC5 implementation update