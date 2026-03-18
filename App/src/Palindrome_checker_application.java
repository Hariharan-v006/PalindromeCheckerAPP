import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

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
        Stack<Character> stack = new Stack<>();
        for( char c: text.toCharArray()){
            stack.push(c);
        }
        for(char c: text.toCharArray()){
            if(!stack.pop().equals(c)){
                flag = false;
                break;
            }
        }
        System.out.println((flag)?"It's a palindrome":"Not a palindrome");
    }
}
