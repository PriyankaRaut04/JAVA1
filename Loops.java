import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // System.out.println("................FOR LOOP................");

        // i++ -> i+1 (increment)
        // for (int i = 0; i <= 10; i++) {
        //     System.out.println("hello prem");
        // }

        // System.out.println("................WHILE LOOP................");
        // int i = 0;
        // while (i<=11) {
        //     System.out.println("NAMSKAR");
        //     i++;
        // }

        // System.out.println("................DO WHILE LOOP................");
        // int i = 0;
        // do{ 
        //     System.out.println("NAMSKAR");
        //     }while (i<=11);

// ____________________________________________________________________________________________________________________________

        // PRINT THE SUM OF FIRST n NATURAL NUMBERS (n = 4)

        // Scanner sc = new Scanner(System.in);

        // System.out.print("N: ");
        // int n = sc.nextInt();
        // int sum = 0; 

        // for(int i=1; i<=n; i++)
        // {
        //     sum = sum + i;
        // }
        // System.out.println(sum);

// _____________________________________________________________________________________________________________________________
        // PRINT THE TABLE OF A NUMBER INPUT BY THE USER (N:2);
//1)       Scanner sc = new Scanner(System.in);

//         System.out.print("N: ");
//         int n = sc.nextInt();

//         int sum = 0; 
//         for(int i=0; i<=n; i++)
//         {
//             sum = sum + 2 ;                     //this is an my logic but.....
//             System.out.println(sum); 
//         }

            Scanner sc = new Scanner(System.in);
            System.out.print("N: ");
            int n = sc.nextInt();

            for(int i=1; i<=10; i++){
                // print (n*i)
                System.out.println(n*i);
            }
            System.out.println("task complete ");
    }
}

