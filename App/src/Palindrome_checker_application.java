import java.util.Locale;
import java.util.Scanner;



public class Palindrome_checker_application {
    private static final String Welcome_msg = "Welcome to the Palindrome Checker Management System";
    private static final String Version = "1.0";


    public static void main(String[] args) {
        System.out.println(Welcome_msg);
        System.out.println("Version: " + Version);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(normalized).reverse().toString();
        System.out.println("Is it a palindrome? " + normalized.equals(reversed));
    }
}