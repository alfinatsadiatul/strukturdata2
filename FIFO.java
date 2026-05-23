import java.util.LinkedList;
import java.util.Queue;

public class FIFO {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        //Enqueue 8 data integer
        System.out.println("== PROSES ENQUEUE ==");

        int[] data = {10, 30, 50, 70, 90, 110, 130, 150};

        for (int nilai : data){
            queue.add(nilai);
            System.out.println("Enqueue : " + nilai);
            System.out.println("Isi Queue : " + queue);
        }
        // Sebelum dequeue
        System.out.println("\nSebelum Dequeue : " + queue);

        // proses dequeue
        System.out.println("\n== PROSES DEQUEUE ==");
        int hapus = queue.remove();
        System.out.println("Data Pada Dequeue : " + hapus);

        // setelah dequeue
        System.out.println("Isi Sesudah Dequeue : " + queue);
    }    
}
