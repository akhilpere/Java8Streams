import java.util.ArrayList;
import java.util.List;

public class productMain {
    public static void main(String[] args)
    {
        List<Product> product = new ArrayList<Product>();

//        Adding Products

        product.add(new Product(6,"shoe","sliel2","600"));
        product.add(new Product(2,"shirt","dkekk1","300"));
        product.add(new Product(8,"jeans","eos335","700"));
        product.add(new Product(4,"glasses","xewje,532","1000"));


//    filtering price, fetching price

        Object obj = product.stream()
                      .filter(p ->p.getId()<10)
                              .map(pm ->pm.getPrice()<600);


        System.out.println(product);



    }
}
