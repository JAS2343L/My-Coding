//package A_LEARNING.ARRAYS_PRACTICE;
import java.util.*;

public class Arrays3 {

    Arrays3(){

        Scanner ask = new Scanner(System.in);
        ArrayList<String> storage = new ArrayList<>();
        boolean isusertyping = true;
        
        
        while(isusertyping){
            String add = "";
            System.out.println("\033c[2JWRITE ANYTHING YOU WANT OR TYPE \"exit\" TO EXIT");
            add = ask.nextLine();
            if(add.equalsIgnoreCase("exit")){
                System.out.println("\033cThis Is What You Type All the Time:");
                for(String show : storage){
                    System.out.println(show + ", ");
                }
                isusertyping = false;
            }else{
                storage.add(add);
            }
        }



        ask.close();
    }

    public static void main(String[] args) {
        new Arrays3();
    }
}
