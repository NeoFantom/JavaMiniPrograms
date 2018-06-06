import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Huiqi Xue on 2018/6/4.
 */
public class OrdinalToLetters {

    public static String getName() {
        return "Convert ordinal numbers to letters";
    }

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            int value;
            List<Integer> integers = new ArrayList<>();

            System.out.println("Input numbers to find corresponding letters.");
            System.out.println("Use -1 to input white space or -2 for *.");
            System.out.println("Enter 0 to finish.");
            while ((value = scanner.nextInt()) != 0) {
                integers.add(value);
            }

            if (integers.size() == 0)
                return;
            System.out.println("The letters are:");
            for (Integer n : integers) {
                String s = "";
                if (n == -1)
                    s = " ";
                else if (n == -2)
                    s = "*";
                else
                    s = "" + (char) ((n - 1) + 'a');
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
