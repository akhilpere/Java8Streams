
import java.util.*;

class FindFirst {

    // Driver code
    public static void main(String[] args)
    {

        List<Integer> list = Arrays.asList(3, 5, 7, 9, 11);

        Optional<Integer> answer = list.stream().findFirst();

        if (answer.isPresent()) {
            System.out.println(answer.get());
        }
        else {
            System.out.println("no value");
        }
    }
}
