public class ArrayEquality {
    public static void main(String[] args) {
        //Declaring and initialize two arrays
        int [] arr1 = {1,2,3};
        int [] arr2 = {1,2,3};
        //Initialize variable and wquality test
        int i=0;
        boolean areEqual = true;
        //loop through the arrays and compare
        do {
          if(arr1[i]!= arr2[i]) {
              areEqual = false;
              break;
          }
          i++;
       } while (i < arr1.length && i< arr2.length);
        if (areEqual && arr1.length== arr2.length){
            System.out.println("The arrays are equal");
        } else {
            System.out.println("The arrays are not equal");
        }
      }

    }

