package cardValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static cardValidator.Validator.printValid;


public class MainRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean repeat;
        List<Integer> digits = new ArrayList<>();

        Validator.printCard(in, digits);

        int[] array = Validator.getInts((ArrayList<Integer>) digits);
        printValid(array);
    }
}
