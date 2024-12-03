package PraticePrograms.HashMap;

import java.util.HashMap;

//Create a HashMap to store the mappings of product names to their prices.
public class MapProductToPrice {
    public static void main(String[] args) {
        HashMap<String,Integer> product=new HashMap<>();
        product.put("pen",15);
        product.put("notebook",55);
        product.put("mobile",8564);
        product.put("laptop",90215);
        product.put("bag",1500);
        System.out.println(product);

    }
}
