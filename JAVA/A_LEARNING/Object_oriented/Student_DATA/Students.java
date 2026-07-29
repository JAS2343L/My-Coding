package A_LEARNING.OOPS_PRACTICE.Student_DATA;
import java.io.*;
import java.util.*;

public class Students {

    Students(){

        Scanner scn = new Scanner(System.in);
        ArrayList<SINFO> stdd = new ArrayList<>();
        String clr = "\033[H\033[2J";
        boolean o = true;
        System.out.println(clr);

        while(o){
            int r;
            int choice = 0;
            System.out.println("=====/SCHOOL DATABSE/=====");
            System.out.println("1. New Student");
            System.out.println("2. View Existing Student's");
            System.out.println("3. Delete Student Information");
            System.out.println("4. Exit");
            System.out.print("Your Choice: ");
            try{
                choice = scn.nextInt();
                scn.nextLine();
            }catch(InputMismatchException e){
                System.out.println();
                scn.nextLine();
            }

            int i = 1;

            switch(choice){
                case 1:
                    try{
                        System.out.print(clr+"Name Of the student: ");
                        String n = scn.nextLine();
                        System.out.print("Declare The Roll.no for the student: ");
                        r = scn.nextInt();
                        scn.nextLine();
                        System.out.print("How the student is perfoming in class: ");
                        String gb = scn.nextLine();
                        stdd.add(new SINFO(n, r, gb));
                        System.out.println(clr+"Student added!");
                    }catch(InputMismatchException e){
                        System.out.print(clr+"Wrong Roll.no\n");
                        scn.nextLine();
                    } break;

                case 2:
                    System.out.printf(clr+"%-5s | %-12s | %-6s | %s%n", "Sr.No", "Name", "Roll.no", "Performance");
                    System.out.println("==================================================");
                    for(SINFO m : stdd){
                        m.INtro(i);
                        i++;
                    }
                    next();
                    System.out.print("press Enter to continue.../.");
                    scn.nextLine();
                    System.out.print(clr);
                    break;

                case 3:
                    System.out.println(clr);
                       
                    if(stdd.size() <= 0){
                        System.out.println(clr+"There are not any data exist to Delete");
                        break;
                    }else{
                        System.out.printf(clr+"%-5s | %-12s | %-6s | %s%n", "Sr.No", "Name", "Roll.no", "Performance");
                        System.out.println("==================================================");
                        for(SINFO m : stdd){
                            m.INtro(i);
                            i++;
                        }
                        try{
                        System.out.print("\nChoose the Sr.No or type exit: ");
                        String toi = scn.nextLine();
                        if(toi.equalsIgnoreCase("exit")){
                            System.out.println(clr);
                            break;
                        }else{
                            int hoi = Integer.parseInt(toi);
                            stdd.remove(hoi - 1);
                            System.out.println(clr+"Student "+(hoi )+" has been removed!!!");
                            break;
                        }
                    }catch(NumberFormatException e){
                        System.out.println(clr+"Error, Wrong Choice!!!");
                    }catch(IndexOutOfBoundsException e){
                        System.out.println(clr+"Error, Wrong Choice!!!");
                    }
                    break;
                        
                    }
                    

                case 4:
                    System.out.println(clr);
                    o = false;
                    break;
                default:
                    System.out.println(clr+"Error, Wrong Choice!!!");
            }
        }

            scn.close();
        }

    public static void main(String[] args) {
        new Students();
    }
    
    public void next(){
        System.out.println(System.getProperty("line.separator"));
    }

    public void saaving(ArrayList<SINFO>  list){
        try (FileWriter w = new FileWriter("/JAVA/A_LEARNING/OOPS_PRACTICE/Student_DATA/Studentdata.txt")){
            for (SINFO www : list){
                w.write(www.toFileFormat() + System.getProperty("line.separator"));
            }
            System.out.println("Data Saved To Database");
        }catch(IOException e){
            System.out.println("Error saving File!!");
        }
    }
    /*public void reaading(ArrayList<SINFO> list){
        File r = new File("/JAVA/OOPS_PRACTICE/Student_DATA/Studentdata.txt");
        if (!r.exists()){
            System.out.println("File Not Found, YOU HAVE TO CREATE IT FIRST!!");
            return;}

        try{
            Scanner rrr = new Scanner(r);
            while (rrr.hasNextLine()){
                String tripler = rrr.nextLine();
                String[] tok = tripler.split(", ");
                tripler.add(new SINFO(tok[0], Integer.parseInt(tok[1]), tok[2]));
            }
        }catch(Exception e){
            System.out.println("Cant able to load data!!");
        }
        
    }*/

}
