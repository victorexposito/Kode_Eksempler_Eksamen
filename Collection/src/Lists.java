import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        List al = new ArrayList();
        al.add("Sarah");
        al.add("Ole");
        al.add("Peter");
        System.out.println(" ArrayList Elements");
        System.out.print("\t" + al);

        List ll = new LinkedList();
        ll.add("Sarah");
        ll.add("Ole");
        ll.add("Peter");
       // ll.remove();
       // ll.addAll(al);
      //  boolean var = ll.contains("Victor");
        System.out.println();
        System.out.println(" LinkedList Elements");
        System.out.print("\t" + ll);
       // System.out.println(var);
    }
}
