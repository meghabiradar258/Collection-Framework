package PraticePrograms.ArrayList;

import java.util.ArrayList;

public class JoinTwoList {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("blue");
        color.add("pink");
        color.add("black");
        color.add("white");
        System.out.println("colors in arraylist" + color);
        ArrayList<String> color1 = new ArrayList<>();
        color1.add("purple");
        color1.add("red");
        color1.add("blue");
        color1.add("pink");
        color1.add("black");
        System.out.println("colors in arraylist" + color1);
    color.addAll(color1);
        System.out.println(color);
    }

}
