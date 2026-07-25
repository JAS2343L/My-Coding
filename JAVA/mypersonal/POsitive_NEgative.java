package mypersonal;

import java.util.Scanner;

public class POsitive_NEgative{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nChoose An NUMBERR: ");
        int mangu = sc.nextInt();
        
        if (mangu > 0){
            System.out.print("Number " +mangu+ " is POSITIVE\n");
        } else if ( mangu < 0) {
            System.out.print("Number "+mangu+" is NEGATIVE\n");
        } else if (mangu == 0) {
            System.out.println("THIS NUMBER IS ALSO CALLED AS ZERO!!!");
        }
        sc.close();
    }
}
