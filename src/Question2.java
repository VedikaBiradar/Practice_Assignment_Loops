import java.util.Scanner;

public class Question2 {
    /*  Find the Greatest Common Divisor
Write a program that prompts the user to enter two positive integers,
and find their greatest common divisor (GCD).
*/
    Scanner sc = new Scanner(System.in);
    public void greatestCommonDivisor(){
        System.out.println("Enter the first number: ");
        int n1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2=sc.nextInt();

        int gcd=1;
        if(n1==n2){
            gcd=n1;
            System.out.println("The greatest common divisor is: "+gcd);
        }
        else if(n1==0 || n2==0){
            gcd=Math.max(n1,n2);
            System.out.println("The greatest common divisor is: "+gcd);
        }
        else{
            for(int i=1;i<=Math.min(n1,n2);i++){
                if(n1%i==0 && n2%i==0){
                    gcd=i;
                }
            }
            System.out.println("The greatest common divisor is: "+gcd);
        }


    }

}