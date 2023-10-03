package pkg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class UpperBoundWildCard<T extends Number> {
    private List<T> numbers = new ArrayList<>();

    public void add(T number) {
        numbers.add(number);
    }

    public List<T> getNumbers() {
        return numbers;
    }
}

public class Main {
    public static <T extends Number> double sum(List<T> numbers) {
        double total = 0.0;
        for (T number : numbers) {
            total += number.doubleValue();
        }
        return total;
    }

    public static <T extends Comparable<T>> void sort(List<T> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UpperBoundWildCard<Integer> intList = new UpperBoundWildCard<>();
        UpperBoundWildCard<Double> doubleList = new UpperBoundWildCard<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Integer");
            System.out.println("2. Add Double");
            System.out.println("3. Sum Integers");
            System.out.println("4. Sum Doubles");
            System.out.println("5. Sort Integers");
            System.out.println("6. Sort Doubles");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter an integer: ");
                    int intInput = scanner.nextInt();
                    intList.add(intInput);
                    break;
                case 2:
                    System.out.print("Enter a double: ");
                    double doubleInput = scanner.nextDouble();
                    doubleList.add(doubleInput);
                    break;
                case 3:
                    System.out.println("Sum of Integers: " + sum(intList.getNumbers()));
                    break;
                case 4:
                    System.out.println("Sum of Doubles: " + sum(doubleList.getNumbers()));
                    break;
                case 5:
                    sort(intList.getNumbers());
                    System.out.println("Sorted Integers: " + intList.getNumbers());
                    break;
                case 6:
                    sort(doubleList.getNumbers());
                    System.out.println("Sorted Doubles: " + doubleList.getNumbers());
                    break;
                case 7:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
	
