import java.util.Scanner;

public class lab3_scanner {

    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display all days
        System.out.println("Days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }

        // input for user
        System.out.print("Enter a day: ");
        String input = scanner.nextLine().toUpperCase();

        try {
            Day selectedDay = Day.valueOf(input);

            switch (selectedDay) {
                case SUNDAY:
                    System.out.println("Business hours: 11 AM - 5 PM");
                    break;
                case SATURDAY:
                    System.out.println("Business hours: 10 AM - 6 PM");
                    break;
                default:
                    System.out.println("Business hours: 9 AM - 9 PM");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered.");
        }

        scanner.close();
    }
}
