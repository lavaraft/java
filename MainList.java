import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MainList{

    public static void main(String[] args) {
        
        String[] fruitsArray = {"Banana", "Apple", "Kiwi", "Peach"};
        ArrayList<String> fruitsArrayList = new ArrayList<>(Arrays.asList("Banana", "Apple", "Kiwi", "Peach"));
        for (String element : fruitsArray) {
            System.out.println(element); // zeigt alles aus der liste an wird und untereinander
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a fruit to search for: ");
        String searchFruit = scanner.nextLine();

        if (fruitsArrayList.contains(searchFruit)) {
            System.out.println(searchFruit + " exists in the list.");
        } else {
            System.out.println(searchFruit + " does not exist in the list.");
        }

        Collections.sort(fruitsArrayList);
        System.out.println("Sorted fruits: " + fruitsArrayList);

        scanner.close();
    
       
    }
}
