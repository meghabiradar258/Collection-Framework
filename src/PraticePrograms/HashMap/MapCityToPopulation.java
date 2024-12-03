package PraticePrograms.HashMap;

import java.util.HashMap;

//Create a HashMap to store the mappings of city names to their populations.
public class MapCityToPopulation {
    public static void main(String[] args) {
        HashMap<String,Double> city=new HashMap<>();
        city.put("Pune",56523.5);
        city.put("mumbai",89623.5);
        city.put("Latur",16523.5);
        System.out.println(city);


    }
}
