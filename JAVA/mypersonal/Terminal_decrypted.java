package mypersonal;
import java.util.Scanner;
import java.io.*;

public class Terminal_decrypted {
    Scanner scan = new Scanner(System.in);
    final String cls = "\033[H\033[2J";
    private boolean exit = false;
    String uin = "";

    Terminal_decrypted(){
        System.out.print(cls + "Terminal 1.0 made by Jasmeet Singh using JAVA\n\n");
        whileloop();
    }
    
    public void theusr(){
        System.out.print("[Kingg@JAVA]$ ");
        uin = scan.nextLine().trim();
    }
    
    public void whileloop(){
        while(!exit){
            uin = "";
            theusr();
            /*try{
                FileWriter his = new FileWriter("JAVA/History.txt", true);
                his.write(uin + "\n");
                his.close();
            }catch(IOException e){
                e.printStackTrace();
            }*/
            if(uin.equals("exit")){
                exit = true;
            }else if(uin.equals("clear")){
                System.out.print(cls);
            }else if(uin.equals("ls")){
                ls();
            }else if(uin.equals("fastfetch")){
                fastfetch();
            }else if(uin.equals("history")){
                history();
            }
            else{
                System.out.println(uin+" : Command Not Found !" );
            }
        }
    }

    public void ls(){
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("bash", "-c", "ls");
        try {
            Process process = processBuilder.start();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))){
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
            int exitCode = process.waitFor();
            if (exitCode != 0) {
                System.err.println("Command failed with exit code: " + exitCode);
            }

        } catch (IOException | InterruptedException e) {
            System.out.print("ERROR running ls!\n");
        }
    }

    public void fastfetch(){
        try{
            BufferedReader read = new BufferedReader(new FileReader("JAVA/fastfetch.txt"));
            String line;
            while((line = read.readLine()) != null){
                System.out.println(line);
            } 
            read.close();
        }catch(IOException e){
            e.printStackTrace();
            System.out.print("ERROR running fastfetch!\n");
        }
    }
    
    public void history(){
        try(BufferedReader ht = new BufferedReader(new FileReader("JAVA/History.txt"))){
            String line;
            while((line = ht.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){System.out.println("ERROR SHOWING HIS-TORY!");}
    }


    public static void main(String[] args) {
        new Terminal_decrypted();
    }
}
