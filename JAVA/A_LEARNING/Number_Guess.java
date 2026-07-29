package mypersonal;

import java.util.Random;
import java.util.Scanner;

public class Number_Guess {
    public static void GUESS(){

        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        int nambar = r.nextInt(100) + 1;
        int gas = 0;
        int attempts = 0;
        int nplus = nambar + r.nextInt(10);
        int nminus = nambar - r.nextInt(10);

        System.out.println("\n\n\n-----GASS THAT NUMBAR-----\n");

        while (gas != nambar){
            System.out.println("GUESS: ");
            gas = s.nextInt();
            attempts++;

            if (attempts == 8){
                System.out.println("The Number Is Between " + nplus + " AND " + nminus);
            }

            if (gas < nambar){
                System.out.print("\nYOUR NAMBER IS LOWER\n");
            } else if (gas > nambar){
                System.out.print("\nYOUR NAMBAR IS HIGHER\n");
            } else {
                System.out.println("\nYES!!, CORRECT ANSWAR IS " + nambar + ",    Your Attempts: "+attempts );
            }
        
        }
        s.close();
    }
    
    public static void main(String[] args){
        GUESS();
    }
}