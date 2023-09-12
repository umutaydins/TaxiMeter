import java.util.Scanner;

public class TaxiMeter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance traveled in kilometers: ");

        double distance = scanner.nextDouble();

        scanner.close();

        // Calculate the taxi fare
        double initialFee = 10.0;
        double pricePerKilometer = 2.20;
        double minimumFare = 20.0;

        double totalFare = initialFee + (distance * pricePerKilometer);

        // Check if the total fare is below the minimum fare
        if (totalFare < minimumFare) {
            totalFare = minimumFare;
        }

        System.out.println("Taxi fare: $" + totalFare);
    }
}
