// Implementation of Stream.peek()
// in Java 8


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class peekExample
 {
 //     Driver code
     public static void main(String[] args) {
      
      //         creating the list of integers
         List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

         list.stream()
                 .peek( System.out::println );

         List<Integer> List = Arrays.asList(1, 2, 3, 4, 5);
      
      
//          Using peek without any terminal
//          operation does nothing. Hence this
//          code will produce no output.
         List<Integer> newList = list.stream()
                 .peek(System.out::println)
                 .collect(Collectors.toList());
      
//         Printing the integers
         System.out.println(newList);
     }
}
