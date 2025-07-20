package com.prem.codes;

// SCANNER 
import java.util.Scanner;

// public class Secondclass {
//     public static void main(String[] arg){
        
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter name: ");
//         String name = sc.nextLine();


//         System.out.print("Enter age: ");
//         int age = sc.nextInt();
        
//         System.out.print("Enter cgp: ");
//         double cgp = sc.nextDouble();

//         System.out.println("helo "+ name +" age: " +age+ " CGPA: "+cgp);
//     }
// }

// QUESTION : TAKE 2 VARIABLES 'a' & 'b' & PRINT THEIR SUM USING SCANNER 
public class Secondclass {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();

        System.out.print("b: ");
        int b = sc.nextInt();
        
        int sum = a+b;
        System.out.print("SUM: ");

        System.out.println(sum);
    }
}

