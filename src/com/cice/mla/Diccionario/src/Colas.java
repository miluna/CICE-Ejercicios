import java.util.PriorityQueue;

public class Colas {

    public static void main(String[] args) {
        PriorityQueue<Double> pq = new PriorityQueue<>();

        pq.add(123.256);
        pq.add(148.123);
        pq.add(123.456);
        pq.add(149.456);

        int size = pq.size();

        for (int i = 0; i < size; i++){
            System.out.println(pq.poll());
        }
        System.out.println("--------");
    }
}
