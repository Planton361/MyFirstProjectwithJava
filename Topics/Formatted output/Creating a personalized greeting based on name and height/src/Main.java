import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object which will allow us to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Use the Scanner's nextLine method to read a line of input
        String name = scanner.nextLine();

        // Use the Scanner's nextInt method to read the next integer
        int height = scanner.nextInt();

        // TODO: Print the given statement replacing the placeholders with given inputs using formatted string.
        String output = String.format("Hello, my name is %s and I am %d cm tall.",name, height);
        System.out.printf(output);
    }
}