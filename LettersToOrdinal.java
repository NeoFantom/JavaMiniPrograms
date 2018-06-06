import java.util.Scanner;

public class LettersToOrdinal {

    public static String getName() {
        return "Convert character to alphabetical order.";
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Type any letter or \'q\' for quit:");
            String input = scanner.nextLine().toUpperCase();
            switch (input) {
                case "Q":
                    break;
                default:
                    for (int i = 0; i < input.length(); i++)
                        if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z')
                            System.out.println("" + input.charAt(i) + ": " + (int) (input.charAt(i) - '@'));
            }
        }
    }
}