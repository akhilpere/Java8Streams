//   Implementation of Distinct()
//   In Java 8

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample
  {
  //       Driver code
      public static void main(String[] args) {
        //      Creating the list of Strings
          Collection<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");
        
// Get collection without duplicate i.e. distinct only
          List<String> distinctElements = list.stream()
                  .distinct()
                  .collect(Collectors.toList());

//Let's verify distinct elements
          System.out.println(distinctElements);
      }
}
