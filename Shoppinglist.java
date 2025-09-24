import java.util.ArrayList;
import java.util.HashMap; 

class Shoppinglist {
    public static void main(String[] args) {
        
        // 1
        String [] liste = {"Banane", "Apfel", "Gurke"};
        for (int i=0; i<liste.length; i++){
        System.out.println(liste[i]);
        }
        
        // 2
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Berlin");
        cities.add("Tokyo");
        cities.add("Oslo");
        cities.add("New York");
        for (int l = 0; l < cities.size(); l++){
        System.out.println(cities.get(l));
        }

        // 3
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");   
        capitalCities.put("India", "New-Dheli");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Russia", "Moscow");
        System.out.println(capitalCities); 
        
        // 4
        ArrayList<String> shoppinglist = new ArrayList<String>();
        shoppinglist.add("Banana");
        shoppinglist.add("Apple");
        System.out.println(shoppinglist);
    }
}