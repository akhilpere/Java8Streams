import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample
  {
      public static void main(String[] args) {
          List<String> str = Arrays.asList("AB1", "AB2", "AB3");


          String chString = str.stream()
                  .map(String::valueOf)
                  .collect(Collectors.joining());


          System.out.println(chString);
      }
  }

