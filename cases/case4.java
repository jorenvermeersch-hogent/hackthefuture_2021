package cases;

import java.util.ArrayList;
import java.util.List;

public class case4 {

    public static void main(String[] args) {
        new case4().run();
    }

    public void run() {
        int number = 2;
        List<Integer> perfect_numbers = new ArrayList<>();
        while (perfect_numbers.size() < 4) {
            if (sum_dividers(number) == number) {
                perfect_numbers.add(number);
            }
            number++;
        }
        System.out.println(perfect_numbers.get(3));

    }

    public int sum_dividers(int number) {
        int sum = 1;
        for (int div = 2; div <= number % 2; div++) {
            if (number % div == 0)
                sum += div;
        }
        return sum;
    }
}
