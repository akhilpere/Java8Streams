// Implementation of Stream.sorted()
// to get a stream of elements
// sorted in their natural order

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample
  {
  // Driver code
      public static void main(String[] args) {
        
        // Creating a list of integers
          List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
        
        
//          displaying the stream with elements
//           sorted in natural order
        
        
          List<Integer> sortedList = list.stream()
                  .sorted()
                  .collect(Collectors.toList());

          System.out.println(sortedList);
      }
}
