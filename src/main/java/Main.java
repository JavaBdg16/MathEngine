import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final String FILE_NAME = "operations.txt";

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        // add 2 2
//        System.out.println("Enter an operation and two numbers");
//        String userInput = scanner.nextLine();

        DynamicHelper helper = new DynamicHelper(new MathProcessing[] {
                new Adder(),
                new Multiplier(),
                new Divider(),
                new Substracter()
        });

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
                try {
                    helper.doProcess(inputLine);
                } catch (InvalidStatementException ex) {
                    System.out.println("Error invalid statement: " + ex.getMessage());
                    if (ex.getCause() != null) {
                        System.out.println(" caused by " + ex.getCause());
                    }
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + FILE_NAME);
        } catch (IOException ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error processing file: " + ex.getMessage());
        }
    }
}
