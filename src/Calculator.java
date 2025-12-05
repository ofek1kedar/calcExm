import java.util.Scanner;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }
  
    public static void main(String[] args) {
        final int EXIT = 0;
        final int ADD = 1;
        final boolean CHECK = false;
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Calculator Menu ===");
            System.out.println(ADD + ". Add");
            System.out.println(EXIT + ". Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case ADD:
                    System.out.print("Enter two numbers: ");
                    int a = scanner.nextInt();
                    CHECK = isPrime(a);
                    System.out.println("The number is Prime? : " + CHECK);
                    int b = scanner.nextInt();
                    CHECK = isPrime(b);
                    System.out.println("The number is Prime? : " + CHECK);
                    System.out.println("Result = " + add(a, b));
                    break;
                case EXIT:
                    System.out.println("Exiting calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != EXIT);
    }
}


    private static boolean isPrime(int num){

        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }


    }