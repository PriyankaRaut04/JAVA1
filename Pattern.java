// import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.print("A:");
        // int a = sc.nextInt();
        // System.out.print("B:");
        // int b = sc.nextInt();
        // NESTED LOOP -> for in for.......
        // System.out.println("............................Square/Rectangle Patterns.............................");
        // for(int i=1; i<a; i++)
        // {
        //     for(int j=1; j<b; j++){
        //         System.out.print(" * ");   // this is my logic but..........mam code written in notebook but also, mam used same logic ;
        //     }
        //     System.out.println(" ");
        // }

        // System.out.println("...............................HOLLW RECTANGEL................................... ");
        // int a = 4; // rows
        // int b = 5; // columns
        // for (int i = 1; i <= a; i++) {
            //     for (int j = 1; j <= b; j++) {
                //         if (i == 1 || j == 1 || i == a || j == b) {
                    //             System.out.print("* ");
                    //         } else {
                        //             System.out.print("  ");
                        //         }
                        //     }
                        //     System.out.println(); // next line
                        
                        
        // System.out.println("...............................HALF PYRAMID................................... ");
        // int a = 4;
        // int b = 4;
        // for(int i = 1; i <= a; i++){
        //     for(int j = 1; j <= b; j++){
        //         if (i == 4 || i == a || j == 1 || j == b) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println(" ");
        // }

        // System.out.println("...............................HALF PYRAMID................................... ");
        // int n = 4; 
        // for(int i = 1; i <= n; i++){
            //     for(int j = 1; j <= i; j++){
                //         System.out.print("*");
                //     }
                //     System.out.println(" ");
                // }
                
        // System.out.println("...............................INVERT HALF PYRAMID................................... ");
        // int n = 4; 
        
        // for(int i = n; i >= 1 ; i--){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");

        // System.out.println("...........................INVERT HALF PYRAMID (ROTAT BY 180 DEGREE).............................");
        // int n = 4;                          1st method with for loop 
        // for( int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n-i ; j++){
        //         System.out.print(" ");
        //     }
        //     for( int j =1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
    // }
 
        // int n = 4;                          2nd method with if else condition 
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (j <= n - i) {
        //             System.out.print(" ");
        //         } else {
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

        // System.out.println("........................HALP PYRAMID WITH NUMBERS....................");
        // int n = 5; 
        // for(int i = 1; i <= n; i++){
            //     for(int j = 1; j <= i; j++){
                //         System.out.print(j);
                //     }
                //     System.out.println(" ");
                // }
                
        // System.out.println("........................INVERD HALP PYRAMID WITH NUMBERS....................");
        // int n = 5; 
        // for(int i = n; i >= 1; i--){         // my method with old problem logic
        //     for(int j = 1; j <= i; j++)
        //     {
            //         System.out.print(j);
            //     }
            //     System.out.println(" ");
            // }
            // int b = 5; //b=n=5;
            // for(int i = 1; i <= b; i++){         // mam method
            //     for(int j = 1; j <= b-i+1; j++)
            //     {
                //         System.out.print(j);
                //     }
                //     System.out.println(" ");
                // }
                
        // System.out.println("........................INVERD HALP PYRAMID WITH NUMBERS....................");
        // int n = 5;
        // int num = 1;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(num + " ");
        //         num ++; 
        //     }
        //     System.out.println(" ");
        // }
        
        // System.out.println("........................ 0-1 (BINARY) TRIANGLE ........................");
        // int n = 5;
        // for( int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         int sum = i+j;
        //         if (sum % 2 == 0) {
        //             System.out.print(" 1 ");
        //         } else {
        //             System.out.print(" 0 ");
        //         }
        //     }
        //     System.out.println(" "); 
        // }

    }
}


