package cases;

import java.math.BigInteger;

public class case13 {
    public static void main(String[] args) {
        new case13().run();
    }

    public void run() {
        String input = "wwc82CeEDvDEQzjtdA";
        StringBuilder output = new StringBuilder();

        for (char letter : input.toCharArray()) {
            output.append(toHex(letter + "", "UTF-8") + " ");
        }

        String hex_code = output.toString().trim();
        System.out.println(hex_code);

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
