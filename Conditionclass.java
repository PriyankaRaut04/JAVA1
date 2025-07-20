package com.prem.codes;

import java.util.*;

public class Conditionclass {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //......................IF ELSE CONDITION.....................
        // System.out.println("......................IF ELSE CONDITION............................");
        
        // System.out.print("AGE: ");
        // int a = sc.nextInt();
        
        // if (a>18) {
            //     System.out.println("VALID TO ENTER IN PARTY");
            
            // } else {
                //     System.out.println("DO NOT COME IN PARTY");
                
        // System.out.println("......................( IF ,ELSE IF, ELSE ) CONDITION............................");
        
        // System.out.print(" a: ");
        // int a = sc.nextInt();
        
        // System.out.print(" b: ");
        // int b = sc.nextInt();
        
        // if (a % b == 0 ) {
        //     System.out.println(" Bajinga ");
        // }
        // else{
        //     System.out.println(" Not Bajinga ");
            
        // }
        
        System.out.println("......................SWITCH CONDITION............................");
        int button = sc.nextInt();

        switch (button) {
            case 1: System.out.println("HELLOW ");
            break;
            
            case 2: System.out.println("NAMASKAR ");
            break;
            
            case 3: System.out.println("RAMRAM ");
            break;
            
            case 4: System.out.println("RADHEY RADHEY ");
            break;
            
            default: System.out.println("KAS KAY MANDALI  ");
        }
        }
    }
