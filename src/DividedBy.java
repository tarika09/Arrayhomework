public class DividedBy {
    public static void main(String[] args) {
        int num = 1;

        //print numbers divisible by 3
        System.out.println("Numbers divisible by 3:");
        while (num <=100){
            if(num % 3 == 0)
            {
                System.out.println(num);
            }
            num++;
        }
        //reset the variable to 1
        num = 1;
        //print numbers divisible by 5
        System.out.println("\nNumbers divisible by 5:");
        while (num <= 100){
            if(num % 5 == 0)
            {
                System.out.println(num);
            }
            num++;
        }
    }
}
