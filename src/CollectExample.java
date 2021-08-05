import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> evenNumbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
