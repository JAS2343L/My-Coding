package mypersonal;
public class StudentDATA{
    public static void main(String[] args) {
        int[] marks = {100, 75, 60, 50, 25, 10, 0};
        int totem = 0;
        int paaaas = 0;
        int boiled = 0;

        for (int lol = 0; lol < marks.length; lol++){
            System.out.println("Student "+(lol+1)+" Gets "+marks[lol]+" marks");
            totem = totem + marks[lol];

            if(marks[lol] <= 26){
                System.out.println("STUDENT "+(lol+1)+" HAS BEEN FAILED!! \n");
                boiled++;
            }else if(marks[lol] >=27){
                paaaas++;
            }
            
        }

        System.out.println("\nOverall Total Marks: "+totem);
        System.out.println("Total passed: "+paaaas+"\nTotal Failed: "+boiled);
        
    }
}                   
                    