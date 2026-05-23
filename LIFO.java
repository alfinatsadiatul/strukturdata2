import java.util.Stack;

public class LIFO {
    public static void main(String[]args){
        Stack<Integer> stack = new Stack <>();

        // Push 8 data integer
        System.out.println("== PROSES PUSH == ");

        int[] data = {20, 40, 60, 80, 100, 120, 140, 160};

        for (int nilai : data){
            stack.push(nilai);
            System.out.println("Push : " + nilai);
            System.out.println("Isi Stack : " + stack);
        }
        // Sebelum pop
        System.out.println("\nIsi Stack Sebelum Pop :" + stack);

        // Proses pop
        System.out.println("\n== PROSES POP ==");
        int hapus = stack.pop();
        System.out.println("Data Pop : " + hapus);

        // Sesudah pop
        System.out.println("Isi Stack Sesudah Pop : " + stack);
    }
}
