import java.util.Scanner;

class Firstclass{
     public static void main(String[] arg){
//         // output
//         // System.out.println("*");
//         // System.out.println("**");
//         // System.out.println("***");
//         // System.out.println("****");

//         // VARIABLES 
//         // int a = 2;
//         // int b = 3;
//         // String name = "prem";
//         // int sum = a+b;
//         // System.out.println(sum);
//         // System.out.println(name);

//         // QUIZ to calculate a=10, b=5 and formula was a*b/a-b ; 
//         int a = 10;
//         int b = 5;
//         int sum = (a*b)/(a-b); //CORRECT
//         // int sum = a*b/a-b;    WRONG
//         System.out.println(sum); //OUTPUT: 10

// SCANNER
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.println("Hello " + name + ", Age: " + age + ", CGPA: " + cgpa);
     }
}
