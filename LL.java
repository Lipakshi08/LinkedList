package LinkedList;
import java.util.*;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("This");
        System.out.println(list);
        System.out.println(list.size());

        for(int i=0; i<list.size(); i++){
            //if(list.get(i) == value)
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("NULL");

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
