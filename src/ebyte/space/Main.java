package ebyte.space;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[] {1, 2, 3, 4, 5};
//        IntIterator iterator = new IntIterator(arr);
//
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        for (Integer num : arr) {
//            System.out.println(num);
//        }
//
//        ArrayList<Integer> list = new ArrayList<>();
//        Wrapper<List<Integer>> list2 = new Wrapper<>(list);
//        list2.add(123);
//        list2.add(232);
//        list.add(2);
//        for(Integer num : list2) {
//            System.out.println(num);
//        }

        Tree tree = new Tree();
        tree.add(9, 5);
        tree.add(5, 1);
        tree.add(6, 2);

        tree.add(7, 3);
        tree.add(8, 4);
        tree.add(123, 9);
        tree.add(2, 6);
        tree.add(12, 7);
        tree.add(22, 8);
        Node search = tree.search(6);
        System.out.println("Index: " + search.getIndex() + ": " + search.getValue());


    }
}
