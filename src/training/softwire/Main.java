package training.softwire;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    Duck duck1 = new Duck("Daffy", "Mallard", 3500, 20);
	Duck duck2 = new Duck("Robert", "Canvasback", 2000, 12);
	Duck duck3 = new Duck("Sir Quackalot", "Mallard", 100, 17);
    HashMap<Duck, String> duckHashMap = new HashMap<>();

    duckHashMap.put(duck1, "duck1");
    duckHashMap.put(duck2, "duck2");
    duckHashMap.put(duck3, "duck3");

    List<Duck> array = new ArrayList<>();
    array.add(duck1);
    array.add(duck2);
    array.add(duck3);


    Collections.sort(array);

    System.out.println("Using Duck toString() method: ");
    array.forEach(e-> System.out.println(e));

    System.out.println(" ");
    System.out.println("Array sorted by name: ");
    array.forEach(e -> System.out.println(e.getName()));
    }
}
