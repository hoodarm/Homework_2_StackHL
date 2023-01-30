import ibadts.StaticStack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StaticStack<String> stack = new StaticStack<>(7);
        Scanner scanner = new Scanner(System.in);

        while (!stack.isFull())
            stack.push(scanner.next());

        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }
}