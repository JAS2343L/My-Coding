package mypersonal;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args){
        Scanner lol = new Scanner(System.in);

        System.out.print("ENTER ANY NUMBER: ");
        int ae = lol.nextInt();

        for(int a = 1; a <= 10; a++){
            System.out.print(ae + " x " + a + " = " + (ae * a)+"\n");
        }
        lol.close();
    }
}