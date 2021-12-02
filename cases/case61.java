package cases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class case61 {
    public static void main(String[] args) {
        List<String> lijst = new ArrayList<String>(Arrays.asList("pmk", "mPnS", "P3ML", "sLAy", "kXQ", "ab80", "SbM", "bh6", "PB6","65p"));
        System.out.println(lijst); //pitch
        lijst.set(8, "P99p");
        System.out.println(lijst); //pitch ["","","","",""]
    }
}
