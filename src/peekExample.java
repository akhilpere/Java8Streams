import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class peekExample
 {
     public static void main(String[] args) {
         List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

         list.stream()
                 .peek( System.out::println );

         List<Integer> List = Arrays.asList(1, 2, 3, 4, 5);

         List<Integer> newList = list.stream()
                 .peek(System.out::println)
                 .collect(Collectors.toList());

         System.out.println(newList);
     }
}
