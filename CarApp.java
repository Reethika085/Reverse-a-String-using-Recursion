import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Car App Menu ---");
            System.out.println("1. Add Car");
            System.out.println("2. View Cars");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter make: ");
                    String make = scanner.nextLine();

                    System.out.print("Enter model: ");
                    String model = scanner.nextLine();

                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    Car car = new Car(make, model, year);
                    carList.add(car);
                    System.out.println("Car added!");
                    break;

                case 2:
                    if (carList.isEmpty()) {
                        System.out.println("No cars available.");
                    } else {
                        System.out.println("\n--- Car List ---");
                        for (Car c : carList) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting Car App.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
