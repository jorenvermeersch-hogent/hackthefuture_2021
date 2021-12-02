package cases;

import java.math.BigInteger;

public class case13 {
    public static void main(String[] args) {
        new case13().run();
    }

    public void run() {
        String input = "wwc82CeEDvDEQzjtdA";
        String[] encodings = new String[] { "UTF-8", "UTF-16BE", "UTF-16LE", "UTF-16", "US-ASCII", "ISO-8859-1" };

        for (String enc : encodings) {
            System.out.println(toHex(input, enc));
        }
    }

    public String toHex(String arg, String charsetName) {
        String hex = "";

        try {
            hex = String.format("%x", new BigInteger(1, arg.getBytes(charsetName)));

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return hex;
    }
}
