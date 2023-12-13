package mocktest;
import java.util.HashSet;

//Create class

public class HashSetExample {
   
        public static void main(String[] args) {
            // Creating a HashSet to store strings
            HashSet<String> stringSet = new HashSet<>();
    
            // Adding elements to the HashSet
            stringSet.add("Apple");
            stringSet.add("Banana");
            stringSet.add("Apple"); // Adding a duplicate
            stringSet.add("Orange");
            stringSet.add("Banana"); // Adding another duplicate
    
            // Displaying the HashSet
            System.out.println("Elements in the HashSet:");
            for (String element : stringSet) {
                System.out.println(element);
            }
        }
    }
    
    
    
