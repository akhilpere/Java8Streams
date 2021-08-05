import java.util.Arrays;
import java.util.stream.Stream;

public class ToArraysExample
  {
      public static void main(String[] args)
      {
          Stream<String> stream = Stream.of("AB", "CD", "EF", "GH");


          Object[] arr = stream.toArray();

          System.out.println(Arrays.toString(arr));
      }
  }

