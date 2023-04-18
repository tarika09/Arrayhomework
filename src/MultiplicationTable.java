public class MultiplicationTable {
    public static void main(String[] args) {
        int row = 1;
        do{
            int column = 1;
            do {
                System.out.print(row * column + " ");
                column++;
            } while (column <=3); // print valure upto 3
            //move to next line for next row
            System.out.println();
            row++;
        }while (row <= 3);

    }
}
