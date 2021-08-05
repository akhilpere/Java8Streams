import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TosetExample
   {
       public static void main(String[] args) {
           Stream<String> s = Stream.of("Babu",
                   "Siva",
                   "BabuSiva",
                   "Babu Siva");


           Set<String> mySet = s.collect(Collectors.toSet());

           System.out.println(mySet);
       }
}
