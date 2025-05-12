import java.util.*;

public class SortArray{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter Numbers in an array");
        for(int i = 0; i < 10; i++){
            System.out.printf("arr[%d]: ", i);
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < arr.length -1; i++)
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        System.out.println("Sorted: " + Arrays.toString(arr));
        scanner.close();
   }
}
