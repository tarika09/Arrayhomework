import java.util.Scanner;

public class CountanAinString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = scanner.nextLine();
        int count = 0;
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == 'a') {
                count++;
            }
            i++;
        }
        System.out.println("Total number of 'a' in the string:" + count);
       }
    }

