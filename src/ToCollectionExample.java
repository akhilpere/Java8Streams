import java.util.Collection;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToCollectionExample
  {
      public static void main(String[] args) {
          Stream<String> s = Stream.of("B", "F", "BC classes");

          // Using toCollection() method
          // to create a collection
          Collection<String> names = s
                  .collect(Collectors
                          .toCollection(TreeSet::new));

          // Printing the elements
          System.out.println(names);

      }
}
