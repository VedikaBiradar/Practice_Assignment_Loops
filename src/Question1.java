public class Question1 {
    /*Write a program that uses nested for loops to print a multiplication table.*/

    public void mulTable(){

        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.printf("%6d", i*j);
            }
            System.out.println();
        }
    }
}
