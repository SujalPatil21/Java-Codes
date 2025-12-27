import java.util.Scanner;
import java.math.*;
class AreaCalculator{

    Scanner sc = new Scanner(System.in);

    void area(){

        System.out.println("Enter Side Of Square:");
        int side = sc.nextInt();
        int result = side * side ;
        System.out.println("Area Of Square :"  + result);
    }

    void area(int x){

        System.out.println("Enter Lenght Of Rectangle:");
        int lenght = sc.nextInt();
        System.out.println("Enter Breadth Of Rectangle:");
        int breadth = sc.nextInt();
        int result = lenght * breadth ;
        System.out.println("Area Of Rectangle :" + result);
    }

    double area (double y){

        System.out.println("Enter Radius:");
        double radius = sc.nextDouble();
        double result = Math.PI * radius * radius;
        System.out.println("Area Of Circle :" + result);
        return radius ;
    }

}
public class Area{

    public static void main(String[] args){

        AreaCalculator Ac = new AreaCalculator();

        Ac.area();
        Ac.area(0);
        Ac.area(0.0);

    }
}
