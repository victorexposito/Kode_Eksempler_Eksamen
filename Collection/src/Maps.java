import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Audi");
        map.put(2, "Skoda");
        map.put(3, "BMW");
        map.put(4, "Kia");

        //map.remove(2);

        System.out.println("Key\tValue");
        Iterator iterator = map.keySet().iterator();
        while(iterator.hasNext())
        {
            Integer key = (Integer)iterator.next();
            String value = map.get(key);
            System.out.println(key + "\t" + value);
        }
    }
}