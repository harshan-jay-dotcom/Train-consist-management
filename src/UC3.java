import java.util.HashSet;

public class UC3 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        HashSet<Bogie> bogieSet = new HashSet<>();

        bogieSet.add(new Bogie("BG301", "Sleeper", 72));
        bogieSet.add(new Bogie("BG302", "AC Chair", 60));
        bogieSet.add(new Bogie("BG303", "Sleeper", 72));
        bogieSet.add(new Bogie("BG301", "Sleeper", 72)); // duplicate, ignored

        System.out.println("Unique Bogie IDs:");
        for (Bogie b : bogieSet) {
            System.out.println(b);
        }
    }
}
