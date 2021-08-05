
// Implementation of ToArrays
// in Java 8import java.util.Arrays;

import java.util.stream.Stream;

public class ToArraysExample
  {
  //      Driver code
      public static void main(String[] args)
      {
        //           Creating a Stream of Strings
          Stream<String> stream = Stream.of("AB", "CD", "EF", "GH");

//           Using Stream toArray()
          Object[] arr = stream.toArray();
        
        
//        Displaying the elements in array arr
          System.out.println(Arrays.toString(arr));
      }
  }

