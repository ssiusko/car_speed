import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("What is car speed?");
        var carSpeed = scanner.nextDouble();

        while (true) {
            System.out.println("How many hours did you drive? (to stop application enter 0 hours)");
            var travelHours = scanner.nextDouble();

            if (travelHours == 0)
                break;

            var result = carSpeed * travelHours;
            System.out.println("Distance: " + result);
        }
    }
}