import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c,a,b,x;
        Scanner sc=new Scanner(System.in);
   do {
       System.out.println("Main menu\n1.Addition\n2.subtraction\n3.multiptication\n4.Division");
       System.out.println("Enter your choice");
       c=sc.nextInt();
       switch(c){
           case 1:System.out.println("Enter 2 number");
           a=sc.nextInt();
           b= sc.nextInt();
            x=a+b;
            System.out.println(a+"+"+b+"="+x);
           case 2:System.out.println("Enter 2 number");
               a=sc.nextInt();
               b= sc.nextInt();
               x=a-b;
               System.out.println(a+"-"+b+"="+x);
           case 3:System.out.println("Enter 2 number");
               a=sc.nextInt();
               b= sc.nextInt();
               x=a*b;
               System.out.println(a+"*"+b+"="+x);

           case 4:System.out.println("Enter 2 number");
               float e=sc.nextFloat();
               float d= sc.nextFloat();
               float y;
               y=e/d;
               System.out.println(e+"/"+d+"="+y);

       }



   }while(c!=5);

    }
}