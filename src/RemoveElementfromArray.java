import java.util.Arrays;

public class RemoveElementfromArray {
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10,12};
        //element to be removed
        int removeElement = 8 ;
        System.out.println("Original Array:" + Arrays.toString(array));
        int i = 0;
        while (i < array.length) {
            if (array[i]== removeElement) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];

                }
                array[array.length - 1] = 0;
            } else {
                    i++;
                }


            }
                System.out.println("Updated Array : " + Arrays.toString(array));

        }
    }

