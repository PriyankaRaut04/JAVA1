public class Advancedpattern {
    public static void main(String[] args) {
        
        // System.out.println("....................................BUTERFLY PATTERN....................................");
        // int n = 4;

        // // Upper Half
        // for (int i = 1; i <= n; i++) {
        //     // Left Stars
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     // Spaces in the middle   , space = 2 * (n - i)
        //     for (int j = 1; j <= 2 * (n - i); j++) {
        //         System.out.print(" ");
        //     }

        //     // Right Stars
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }
        // int b = 4; //we can take here also "n" on "b" place and aslo definitlty change in loop 
        
        // for (int i = b; i >= 1; i--) {

        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     for (int j = 1; j <= 2 * (b - i); j++) {
        //         System.out.print(" ");
        //     }

        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        System.out.println(".................................... 2. SOLID RHOMBHUS....................................");
        int n = 5;
        // invertes half pramid rotat by 180 
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 5; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}


