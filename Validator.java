package cardValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static cardValidator.Checker.check;

public class Validator {



    static void printCard(Scanner in, List<Integer> digits) {
        boolean repeat;
        do {
            repeat = false;
            System.out.print("Введите номер карты! ");
            String input = in.next();

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c < '0' || c > '9') {
                    repeat = true;
                    digits.clear();
                    break;
                } else digits.add(Integer.valueOf(c - '0'));
            }
        } while (repeat);
    }

    static void printValid(int[] array) {
        if(check(array)) {
            System.out.println("Спасибо, номер корректный");
        } else{
            System.out.println("Извините, номер не корректный");
        }
    }


    public static int[] getInts(ArrayList<Integer> input) {
        Checker.input = input;
        int[] result = new int[input.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.valueOf(input.get(i));
        }
        return result;
    }
}
