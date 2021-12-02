package cases;

public class case3 {
    // Reverse the following String",
    public static void main(String[] args) {
        String input = "YhSswSGxgm0TsxdMDSONBTSTa6YPbbEzGDBpxMny2OVHUMZ2wZ8n6aLCsvWvrcAAVjjQo2d5mvPsfMTopHFb7c9GaRzp8CDUCrVhDzQ44eHeweNs3ObT7bMniHWhdA";
        String reversed = new case3().reverse(input);
        System.out.println(reversed);
    }

    public String reverse(String input) {
        StringBuilder output = new StringBuilder();
        output.append(input);
        output.reverse();
        return output.toString();

    }

}
