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
            morseMap.put("._", "A");
            morseMap.put("_...", "B");
            morseMap.put("_._.", "C");
            morseMap.put("_..", "D");
            morseMap.put(".", "E");
            morseMap.put(".._.", "F");
            morseMap.put("__.", "G");
            morseMap.put("....", "H");
            morseMap.put("..", "I");
            morseMap.put(".___", "J");
            morseMap.put("_._", "K");
            morseMap.put("._..", "L");
            morseMap.put("__", "M");
            morseMap.put("_.", "N");
            morseMap.put("___", "O");
            morseMap.put(".__.", "P");
            morseMap.put("__._", "Q");
            morseMap.put("._.", "R");
            morseMap.put("...", "S");
            morseMap.put("_", "T");
            morseMap.put(".._", "U");
            morseMap.put("..._", "V");
            morseMap.put(".__", "W");
            morseMap.put("_.._", "X");
            morseMap.put("_.__", "Y");
            morseMap.put("_____", "0");
            morseMap.put(".____", "1");
            morseMap.put("..___", "2");
            morseMap.put("...__", "3");
            morseMap.put("...._", "4");
            morseMap.put(".....", "5");
            morseMap.put("_....", "6");
            morseMap.put("__...", "7");
            morseMap.put("___..", "8");
            morseMap.put("____.", "9");
            morseMap.put("._._._", ".");
            morseMap.put("__..__", ",");
            morseMap.put("..__..", "?");

        String codeString = "-.-. -.-- -... --.- -.-. -.-. -. ...- .-.. --.- -.-.";
        String uitkomst = "";

        String[] codeArr = codeString.split(" ");

        for(String item : codeArr){
            item = "\""+ item +"\"";
            System.out.println(item);
            uitkomst += morseMap.get(item);
        }
        System.out.println(uitkomst);
    }
}
