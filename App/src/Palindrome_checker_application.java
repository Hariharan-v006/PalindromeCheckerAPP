import java.util.Locale;
import java.util.Scanner;
public class Palindrome_checker_application {
    private static final String Welcome_msg = "Welcome to the Palindrome Checker Management System";
    private static final String Version = "1.0";

    public static void main(String[] args) {
        System.out.println(Welcome_msg);
        System.out.println("Version: " + Version);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = input.nextLine();
        text = text.toLowerCase(Locale.ROOT);
        boolean flag = true;
        char[] test_string = text.toCharArray();
        int start = 0;
        int end = text.length()-1;
        while(start<end){
            if(test_string[start] != test_string[end]){
                flag = false;
                break;
            }
            start++; end--;
        }
        System.out.println((flag)?"It's a palindrome":"Not a palindrome");
    }
}
