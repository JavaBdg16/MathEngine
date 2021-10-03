import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // add 2 2
        System.out.println("Enter an operation and two numbers");
        String userInput = scanner.nextLine();

        DynamicHelper helper = new DynamicHelper(new MathProcessing[] {
                new Adder(),
                new Multiplier()
        });

        helper.process(userInput);
    }
}
