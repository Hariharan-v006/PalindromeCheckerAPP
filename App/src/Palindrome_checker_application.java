import java.util.*;

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        Stack<Character> stack = new Stack<>();
        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return normalized.equals(reversed.toString());
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : normalized.toCharArray()) {
            deque.add(c);
        }
        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                return false;
            }
        }
        return true;
    }
}

class TwoPointerStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = normalized.length() - 1;
        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class Palindrome_checker_application {
    private static final String Welcome_msg = "Welcome to the Palindrome Checker Management System";
    private static final String Version = "1.0";

    public static void main(String[] args) {
        System.out.println(Welcome_msg);
        System.out.println("Version: " + Version);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        PalindromeStrategy[] strategies = {
                new StackStrategy(),
                new DequeStrategy(),
                new TwoPointerStrategy()
        };

        String[] names = {
                "Stack Strategy",
                "Deque Strategy",
                "Two Pointer Strategy"
        };

        for (int i = 0; i < strategies.length; i++) {
            long start = System.nanoTime();
            boolean result = strategies[i].check(input);
            long end = System.nanoTime();
            long duration = end - start;
            System.out.println(names[i] + " -> Result: " + result + ", Time: " + duration + " ns");
        }
    }
}