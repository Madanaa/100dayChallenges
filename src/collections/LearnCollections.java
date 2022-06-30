package collections;

import java.util.ArrayList;

public class LearnCollections {
    public static void main(String[] args) {
        /*
        Arraylist in java Collections is data structure which implements List<E> interface which means that it can have
        duplicate elements in it.
        ArrayList is an implementation as a dynamic array
         */
        ArrayList list = new ArrayList();
        list.add(12);
        list.add("madan");
        list.add("ram");
        list.add(123.56);
        list.add(true);
        System.out.println(list);

        System.out.println(list.size()-1);
        System.out.println(list.isEmpty());
        list.removeAll(list);
        System.out.println(list.isEmpty());
        System.out.println(list);

    }
}
