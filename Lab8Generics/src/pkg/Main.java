package pkg;
import java.util.*;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class UpperBoundWildcard<T extends Number> {
    private List<T> numbers = new ArrayList<>();

    public void addNumber(T number) {
        numbers.add(number);
    }

    public List<T> getNumbers() {
        return numbers;
    }

    public static double sum(List<? extends Number> list) {
        return list.stream().mapToDouble(Number::doubleValue).sum();
    }

    public static void sort(List<? extends Number> list) {
        list.sort(Comparator.comparingDouble(Number::doubleValue));
    }
}

public class Main {
    public static void main(String[] args) {
        UpperBoundWildcard<Number> ub = new UpperBoundWildcard<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Integer");
            System.out.println("2. Add Double");
            System.out.println("3. Sum");
            System.out.println("4. Sort");
            System.out.println("5. Print List");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
//                    System.out.print("Enter an Integer: ");
//                    int intInput = sc.nextInt();
//                    ub.addNumber(intInput);
//                    break;
                	System.out.print("Enter an Integer: ");
                    int intInput = sc.nextInt();
                    try {
                        ub.addNumber(intInput);
                    } catch (InvalidInputException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter a Double: ");
                    double doubleInput = sc.nextDouble();
                    ub.addNumber(doubleInput);
                    break;
                case 3:
                    System.out.println("Sum of Numbers: " + UpperBoundWildcard.sum(ub.getNumbers()));
                    break;
                case 4:
                    UpperBoundWildcard.sort(ub.getNumbers());
                    System.out.println("Sorted Numbers: " + ub.getNumbers());
                    break;
                case 5:
                    System.out.println("List : "+ub.getNumbers());

                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }
}