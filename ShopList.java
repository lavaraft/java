 import java.util.ArrayList;
import java.util.Arrays;

public class ShopList{

    public static void main(String[] args) {
        
        String[] fruitsArray = {"Banana", "Apple", "Kiwi", "Peach"};
        ArrayList<String> fruitsArrayList = new ArrayList<>(Arrays.asList("Banana", "Apple", "Kiwi", "Peach"));
        for (String element : fruitsArray) {
            System.out.println(element); // zeigt alles aus der liste an wird und untereinander
        }
 
       fruitsArrayList.remove("Banana"); // eine Element entfernen 
        for (String Element : fruitsArrayList) { 
        System.out.println(Element);
        }
    
        int size = fruitsArrayList.size();
        System.out.println(size);

        fruitsArrayList.stream()
                        .map(String::toUpperCase)
                        .forEach(System.out::println); //alle drei gehören zusammen

    }
}