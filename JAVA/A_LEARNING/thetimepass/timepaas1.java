package Projects.thetimepass;
import java.util.Scanner;
public class timepaas1 {
    timepaas1(){
        Scanner s = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        String o = "\033c";

        System.out.println(o + "==========FOR=LOOP==========");
        System.out.print("Enter Number Starts From: ");
        a = s.nextInt();

        System.out.print("Enter Number Where it will Stop: ");
        b=s.nextInt();

        System.out.print("Enter How many times");
        c = s.nextInt();
        System.out.print(o);
        

        flop(a,b,c);

        s.close();
    }

    public void flop(int x, int y, int z){

        if(z < 0){
            for(int l = x ; l > y ; l-=z){
                System.out.println(l);
            }
        }else if(z > 0){
            for(int l = x ; l < y ; l+=z){
                System.out.println(l);
            }
        }

    }
    
    public static void main(String[] args) {
        new timepaas1();
    }
}
