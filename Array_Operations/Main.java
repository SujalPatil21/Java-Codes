import java.util.Scanner;

public class Main{


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t====ARRAY OPERATION=====");

        System.out.println("\nEnter Size of the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int i, sum = 0;
        System.out.println("Enter Array Elements : ");
        for (i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }


        System.out.println("1.Sum Of All Numbers ");
        System.out.println("2.Largest Element");
        System.out.println("3.Smallest Element");
        System.out.println("4.Count Of Even Numbers");
        System.out.println("5.Count Of Odd Numbers");


        int max = arr[0];
        int min = arr[0];

        int count;

        boolean value = true;

        while(value) {

            System.out.println("\nEnter Your Choice : ");
            int ch = sc.nextInt();
            switch (ch) {

                case 1: {
                    for (i = 0; i < n; i++) {

                        sum += arr[i];

                    }

                    System.out.println("Sum of Numbers : " + sum);

                    break;
                }

                case 2: {

                    for (i = 0; i < n; i++) {

                        if (arr[i] > max) {

                            max = arr[i];
                        }


                    }
                    System.out.println("Largest Element : " + max);
                break;

                }

                case 3: {


                    for (i = 0; i < n; i++) {


                        if (arr[i] < min) {

                            min = arr[i];
                        }



                    }
                    System.out.println("Smallest Element : " + min);
                    break;
                }
                case 4: {

                    count = 0;
                    for (i = 0; i < n; i++) {


                        if (arr[i] % 2 == 0) {

                            count++;
                        }

                    }
                    System.out.println("Total Even Numbers : " + count);
                break;
                }

                case 5: {

                    count = 0;

                    for (i = 0; i < n; i++) {


                        if (arr[i] % 2 != 0) {

                            count++;
                        }


                    }
                    System.out.println("Total Odd Numbers : " + count);
                    break;
                }
                case 6 : {

                    System.out.println("Exiting Program....");
                    value = false;

                    break;
                }
            }
        }
    }
}