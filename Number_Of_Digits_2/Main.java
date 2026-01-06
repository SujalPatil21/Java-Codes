import java.util.Scanner;

public class Main{

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        int n ;

        System.out.println("\n\tNUMBER OF DIGITS");
        System.out.println(" \nEnter a Number : " );
        n = sc.nextInt();

        int count = 0;

        while(n!=0){
            n /=10;
            count++;
        }
        System.out.println("Total Number Of Digits : " + count);
    }
}