//  Implementation of Collect()
//  In Java 8

import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {
    //    Driver code
    public static void main(String[] args) {
        
        //        Creating Integers
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        
        
//The collect() method of Stream class can be used to
// Accumulate elements of any Stream into a Collection
        List<Integer> evenNumbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
