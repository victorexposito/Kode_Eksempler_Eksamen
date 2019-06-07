import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {

        int numbers[] = {5,10,39,22,28,8};

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 6 ; i++) {
            set.add(numbers[i]);
        }
        System.out.println(set);

        TreeSet sortedSet = new TreeSet<Integer>(set);
        System.out.println("Sorted List: ");
        System.out.println(sortedSet);

        System.out.println("First element of this set = " + sortedSet.first());
        System.out.println("Last element of this set = " + sortedSet.last());
    }
}
