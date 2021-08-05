// Java Program to demonstrate the working
// of the Collectors.joining() method


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample
  {
  
  //      Driver code
      public static void main(String[] args) {
        
        //          Creating a Character list
          List<String> str = Arrays.asList("AB1", "AB2", "AB3");
        
//           Convert the character list into String
//           using Collectors.joining() method

          String chString = str.stream()
                  .map(String::valueOf)
                  .collect(Collectors.joining());


// Printing the Strings
          System.out.println(chString);
      }
  }

