import java.util.Scanner;

/**
 * Created by Huiqi Xue on 2018/6/4.
 */
public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("0. " + "quit");
            System.out.println("1. " + OrdinalToLetters.getName());
            System.out.println("2. " + LettersToOrdinal.getName());

            int choice = (new Scanner(System.in)).nextInt();
            switch (choice) {
                case 0:
                    return;
                case 1:
                    OrdinalToLetters.run();
                    break;
                case 2:
                    LettersToOrdinal.run();
                    break;
            }
        }
    }
}
