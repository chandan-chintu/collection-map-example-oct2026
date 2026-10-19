package collection.examples.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {

        // declaring list
        List<Integer> list1 = new LinkedList<>(); // {10,-34,0,null,23,-45,-90,100}

        // to store multiple kind of data in single list
        List<?> list2 = new LinkedList<>(); //{10,null,0,-34,"Hi",'t',false,4.56,5.67f}
        List<Object> list3 = new LinkedList<>(); //{10,null,0,-34,"Hi",'t',false,4.56,5.67f}

        // add data
        list1.add(23);
        list1.add(67);
        list1.add(12);
        list1.add(-45);
        list1.add(-78);
        list1.add(0);
        list1.add(67);
        //list1.add(null);
        list1.add(78);
        //list1.add(null);

        System.out.println("list1 is :"+list1);

        // remove data
        list1.remove(6);
        System.out.println("list1 after removing 6th index data : "+list1);

        // size
        System.out.println("list1 size is : "+list1.size());

        // search
        System.out.println("list1 3rd index element is : "+list1.get(3));
        System.out.println("list1 5th index element is : "+list1.get(5));

        // sort
        Collections.sort(list1); // sorts in ascending order
        System.out.println("list1 in ascending order : "+list1);
        Collections.sort(list1, Collections.reverseOrder()); // sorts in descending order
        System.out.println("list1 in descending order : "+list1);

        // traverse the list
        System.out.println("traversing using foreach loop");
        for(Integer l1 : list1){
            System.out.println(l1);
        }

    }
}
