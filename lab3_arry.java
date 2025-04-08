import java.util.ArrayList;

public class lab3_arry {
    public static void main(String[] args) {
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
}
