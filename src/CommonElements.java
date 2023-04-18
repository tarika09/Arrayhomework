import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "Orange", "mango"};
        String[] array2 = {"Orange", "mango", "grape", "watermelon"};

        System.out.println("Array 1 :" + Arrays.toString(array1));
        System.out.println("Array 2 :" + Arrays.toString(array2));


        int i = 0, j = 0;


        while (i < array1.length && j < array2.length) {
            int cmp = array1[i].compareTo(array2[j]);
            if (cmp < 0) {
                i++;

            } else if (cmp > 0) {
                j++;
            } else {
                System.out.println("Common element : " + array1[i]);
                i++;
                j++;
            }
        }
    }
}

