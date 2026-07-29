package Projects.thetimepass;
import java.util.Scanner;

public class timepaas3 {
    timepaas3(){

        String nama = "";
        String KAlA="";
        String cls = "\033[H\033[2J";
        Scanner tooti = new Scanner(System.in);

        System.out.print(cls+"Hello, What is your name ?\nDont want to tell, then type \"exit\" \n:");
        nama = tooti.nextLine();

        boolean nambad = nama.matches(".*\\d.*");

        int enteringtimes = 0;

        while(true){
            if (nama.equals("") || nama.length() <= 2 || nambad){
                enteringtimes++;
                System.out.print(cls+"Heyy, I ASKED your name NOT A RANDOM THING ?\n:");
                nama = tooti.nextLine();
                nambad = nama.matches(".*\\d.*");
                if (enteringtimes == 8){
                    System.out.println(cls+"OK. IF YOU DONT WANT TO SHOW YOUR NAME,\nBYE!");
                    break;
                }
            }else if(nama.equalsIgnoreCase("exit")){
                System.out.println(cls+"Have A Nice Day 🫏");
                break;
            }else{
                enteringtimes = 0;
                System.out.print(cls+"Is your name \""+nama+"\" Correct ?\nYes or No:");
                KAlA = tooti.nextLine();
                if(KAlA.equalsIgnoreCase("yes") || KAlA.equalsIgnoreCase("y")){
                System.out.println(cls+"Hello "+nama+", Welcome to CLub!");
                break;
                }else if(KAlA.equalsIgnoreCase("no") || KAlA.equalsIgnoreCase("n")){
                    System.out.print(cls+"Enter Your Name Again PLease, or type \"exit\":");
                    nama = tooti.nextLine();
                }   
            }
        }
        tooti.close();
        
    }
    public static void main(String[] args) {
        new timepaas3();
    }
}
