import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c, a, b, x;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Main menu\n1.Addition\n2.subtraction\n3.multiptication\n4.Division\n5.Exit");
            System.out.println("Enter your choice");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Enter 2 number");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    x = a + b;
                    System.out.println(a + "+" + b + "=" + x);
                    break;
                case 2:
                    System.out.println("Enter 2 number");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    x = a - b;
                    System.out.println(a + "-" + b + "=" + x);
                    break;
                case 3:
                    System.out.println("Enter 2 number");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    x = a * b;
                    System.out.println(a + "*" + b + "=" + x);
                    break;

                case 4:
                    System.out.println("Enter 2 number");
                    int e = sc.nextInt();
                    int d = sc.nextInt();

                    try {
                        int y = e / d;
                        System.out.println(e + "/" + d + "=" + y);
                    } catch (ArithmeticException h) {
                        System.out.println("division by zero");
                    }

                    break;
                case 5:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("invalid choice...Please enter your choice... ");
                    break;


            }
        }while (c != 5) ;


    }
}