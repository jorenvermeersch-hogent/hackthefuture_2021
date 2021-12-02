package cases;

import java.util.Arrays;

public class case34 {
    public static void main(String[] args) {
        String zin = "T4amo0xQcXm1EnmexN5gFXFpiXkOT1hgdsBaCT2dOUVdXWtcLWWjnliBv";

        int lengteZin = zin.length();

        String zinInAlphabetischeVolgOrde[], zinArr[];

        zinArr = zin.split("");
        zinInAlphabetischeVolgOrde = zin.split("");
        Arrays.sort(zinInAlphabetischeVolgOrde);

        boolean isAlpha = true;
        for (int i = 0; i < lengteZin; i++) {
            if (zinInAlphabetischeVolgOrde[i] != zinArr[i]) {
                isAlpha = false;
                break;
            }
        }
        if (isAlpha)
            System.out.println("Y");
        else
            System.out.println("N");
    }

    public String sorted_alphanumerically(String text) {
        String[] letters = text.split("");
        Arrays.sort(letters);

        return Arrays.equals(letters, text.split("")) ? "Y" : "N";
    }
}
