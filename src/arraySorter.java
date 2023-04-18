import java.util.Scanner;

public class arraySorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Accepting input from user
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] arr = new int [size];

        System.out.println("Enter the elements of arrays:");
        for (int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        //sorting the array in ascending order using while loop
        int i = 0;
        while (i<size){
            int j = i + 1;
            while (j < size){
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
            i++;
        }
        //Printing the sorted array
        System.out.println("The sorted array is:");
        for (int num : arr) {
            System.out.println(num + " ");
        }

    }
}
