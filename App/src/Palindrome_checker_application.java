import java.util.Locale;
import java.util.Scanner;



public class Palindrome_checker_application {
    private static final String Welcome_msg = "Welcome to the Palindrome Checker Management System";
    private static final String Version = "1.0";

    public static boolean isPalindrome(String str, int start, int end) {

        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        System.out.println(Welcome_msg);
        System.out.println("Version: " + Version);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        input = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        scanner.close();
    }
}