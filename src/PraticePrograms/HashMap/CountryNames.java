package PraticePrograms.HashMap;

import java.util.HashMap;

//Create a HashMap to store the mappings of country names to their capitals.
public class CountryNames {
    public static void main(String[] args) {


        HashMap<String, String> county = new HashMap<>();
         county.put("India","Delhi");
        county.put("France", "Paris");
        county.put("Japan", "Tokyo");
        System.out.println(county);



    }



}
