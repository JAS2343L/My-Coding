package A_LEARNING.ARRAYS_PRACTICE;
import java.util.ArrayList;
import java.util.Scanner;


public class ARRays2 {
    public static void main(String[] args) {

        String cl = "\033[H\033[2J";

        ArrayList <String> ab = new ArrayList<>();
        Scanner c = new Scanner(System.in);
        
        System.out.print(cl+"What is your name: ");
        ab.add(c.nextLine());

        System.out.print("What iS your age: ");
        ab.add(c.nextLine());

        System.out.print("What iS Your Hobby?: ");
        ab.add(c.nextLine());

        for (String lol : ab){
            System.out.println(lol);
        }

        c.close();

    }
}
