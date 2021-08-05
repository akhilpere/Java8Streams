import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample
  {
      public static void main(String[] args) {
          Collection<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");

          List<String> distinctElements = list.stream()
                  .distinct()
                  .collect(Collectors.toList());


          System.out.println(distinctElements);
      }
}
