package collection.examples.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        Set<Integer> set1 = new TreeSet<>();
        set1.add(34);
        set1.add(56);
        set1.add(-90);
        set1.add(78);
        set1.add(0);
        set1.add(-45);
        set1.add(33);
        set1.add(33);

        System.out.println("set1 is : "+set1);

        set1.remove(56);
        System.out.println("set1 after removing data : "+set1);

        System.out.println("traverse using foreach loop");
        for(Integer s1 : set1){
            System.out.println(s1);
        }
    }
}
