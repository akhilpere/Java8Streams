
// Java code to show the implementation of
// Collectors toSet() function


import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TosetExample
   {
   // Driver code
       public static void main(String[] args) {
          
          // creating a Stream of strings
           Stream<String> s = Stream.of("Babu",
                   "Siva",
                   "BabuSiva",
                   "Babu Siva");

// using Collectors toSet() function
           Set<String> mySet = s.collect(Collectors.toSet());
          
          
// printing the elements
           System.out.println(mySet);
       }
}
