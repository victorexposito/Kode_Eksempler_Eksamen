import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(42);
        q.add(-5);
        q.add(30);
        q.add(28);

        int size = q.size();
        for (int i = 0; i < size; i++){
            int element = q.remove();
            if(element >= 30) {
                System.out.println(element);
                q.add(element);
            }
        }

        System.out.println();

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }

    }



}
