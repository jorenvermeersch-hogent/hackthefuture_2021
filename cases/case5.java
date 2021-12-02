package cases;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class case5 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://htf.bewire.org/investigation/a26d2b2c-c772-4256-ae79-8cb34a42f1a6");
            URLConnection con = url.openConnection();
            HttpURLConnection http = (HttpURLConnection)con;
            http.setRequestMethod("POST"); // PUT is another valid option
            http.setDoOutput(true);
        } catch (Exception e) {
            
        }
        
    }
}
