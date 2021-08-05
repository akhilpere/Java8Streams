//  Java code for forEach()

import java.util.ArrayList;
import java.util.List;
public class ForEachExample {
    
    //    Driver code
    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<String>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hocky");
        System.out.println("------------Iterating by passing lambda expression--------------");
        
        
 //        Using  stream forEach()
//        This method takes a single parameter which is a functional interface
//        you can pass lambda expression as an argument.
        gamesList.forEach(games -> System.out.println(games));

    }
}  
