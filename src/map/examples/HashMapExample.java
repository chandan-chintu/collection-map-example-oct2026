package map.examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();

        map1.put(105,"Mango");
        map1.put(107,"Guava");
        map1.put(100,"Apple");
        map1.put(101,"orange");
        map1.put(104,"grapes");
        map1.put(110,"watermelon");
        map1.put(108,"grapes");
        map1.put(103,"orange");
        map1.put(103,"banana"); // old value for key 103 will be removed and new value will be added

        System.out.println("map1 is : "+map1);

        map1.remove(104);
        System.out.println("map1 after 104 key removal : "+map1);

        System.out.println("traverse using foreach loop");
        for(Map.Entry m1 : map1.entrySet()){
            System.out.println(m1.getKey()+"---"+m1.getValue());
        }
    }
}
