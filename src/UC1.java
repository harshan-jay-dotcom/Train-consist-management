import java.util.ArrayList;
import java.util.List;

public class UC1 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<Bogie> trainConsist = new ArrayList<>();

        // Add sample bogies
        trainConsist.add(new Bogie("BG101", "Engine", 0));
        trainConsist.add(new Bogie("BG102", "Sleeper", 72));
        trainConsist.add(new Bogie("BG103", "AC Chair", 60));

        System.out.println("Train consist initialized:");
        for (Bogie b : trainConsist) {
            System.out.println(b);
        }

        System.out.println("Initial bogie count: " + trainConsist.size());
    }
}
//end