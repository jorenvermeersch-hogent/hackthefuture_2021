package cases;

public class case97 {
    public String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        new case97().run();
    }

    public void run() {
        String encrypted = "rcropnbuvfjelp";

        for (int shift = 1; shift < alphabet.length(); shift++) {
            System.out.println(caesar(encrypted, shift));
        }
    }

    public String caesar(String encrypted, int shift) {
        StringBuilder plaintext = new StringBuilder();

        for (char letter : encrypted.toCharArray()) {
            char plain_letter = alphabet.charAt((alphabet.indexOf(letter) + shift) % alphabet.length());
            plaintext.append(plain_letter);
        }

        return plaintext.toString();
    }

}
