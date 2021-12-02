package cases;

import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class case75 {
    public static void main(String[] args) {
        Map<String, String> morseMap  = new HashMap<String, String>();
            morseMap.put(".-", "a");
            morseMap.put("-...", "b");
            morseMap.put("-.-.", "c");
            morseMap.put("-..", "d");
            morseMap.put(".", "e");
            morseMap.put("..-.", "f");
            morseMap.put("--.", "g");
            morseMap.put("....", "h");
            morseMap.put("..", "i");
            morseMap.put(".---", "j");
            morseMap.put("-.-", "k");
            morseMap.put(".-..", "l");
            morseMap.put("--", "m");
            morseMap.put("-.", "n");
            morseMap.put("---", "o");
            morseMap.put(".--.", "p");
            morseMap.put("--.-", "q");
            morseMap.put(".-.", "r");
            morseMap.put("...", "s");
            morseMap.put("-", "t");
            morseMap.put("..-", "u");
            morseMap.put("...-", "V");
            morseMap.put(".--", "w");
            morseMap.put("-..-", "x");
            morseMap.put("-.--", "y");
            morseMap.put("-----", "0");
            morseMap.put(".----", "1");
            morseMap.put("..---", "2");
            morseMap.put("...--", "3");
            morseMap.put("....-", "4");
            morseMap.put(".....", "5");
            morseMap.put("-....", "6");
            morseMap.put("--...", "7");
            morseMap.put("---..", "8");
            morseMap.put("----.", "9");
            morseMap.put(".-.-.-", ".");
            morseMap.put("--..--", ",");
            morseMap.put("..--..", "?");

        String codeString = "-.-. -.-- -... --.- -.-. -.-. -. ...- .-.. --.- -.-.";
        String uitkomst = "";

        String[] codeArr = codeString.split(" ");

        for(String item : codeArr){
            System.out.println(item);
            uitkomst += morseMap.get(item);
        }
        System.out.println(uitkomst);
    }
}
