import java.util.Arrays;

public class quicksort {
    static void quickSort(int[] data, int low, int high){
        if (low < high){

            int pivot = partition(data, low, high);

            quickSort(data, low, pivot-1);
            quickSort(data, pivot + 1, high);
        }
    }
    static int partition(int[]data, int low, int high){

        int pivot = data[high];
        int i = low -1;

        for(int j = low;j < high; j++){
            if(data[j] < pivot){
                i++;

                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        int temp = data[i + 1];
        data[i + 1]= data [high];
        data[high] = temp;

        return i + 1;
    }
    
    public static void main(String[] args) {
        int[] data = {30, 12, 16, 76, 20, 90, 98, 50};
        System.out.println("Data Sebelum Urut :");
        System.out.println(Arrays.toString(data));

        quickSort(data, 0, data.length - 1);
        System.out.println("\nData Setelah Urut : ");
        System.out.println(Arrays.toString(data));
    }
}
