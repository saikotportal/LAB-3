import java.util.ArrayList;
import java.util.Scanner;

public class lab3_combine {

    // Lab 3a 
    public static void lab3a() {
        ArrayList<String> progLanguages = new ArrayList<>();

        
        progLanguages.add("Java");
        progLanguages.add("C++");
        progLanguages.add("Python");
        progLanguages.add("BASIC");
        progLanguages.add("Cobol");
        progLanguages.add("Ada");

        
        progLanguages.add(0, "FORTRAN");

        
        System.out.println("Number of elements: " + progLanguages.size());

        
        progLanguages.remove(4);

        
        System.out.println("Contains Ada: " + progLanguages.contains("Ada"));

        
        int index = progLanguages.indexOf("Cobol");
        System.out.println("Index of Cobol: " + index);

       
        if (index != -1) {
            progLanguages.set(index, "COBOL");
        }

        
        System.out.println("Programming Languages:");
        for (String lang : progLanguages) {
            System.out.println(lang);
        }
    }

    // Lab 3b
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    
    public static void lab3b() {
        Scanner scanner = new Scanner(System.in);

        // Display all days
        System.out.println("Days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }

        // Get user input
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

    // Main method .)
    public static void main(String[] args) {
        System.out.println("=== Lab 3a ===");
        lab3a();

        System.out.println("\n=== Lab 3b ===");
        lab3b();
    }
}
