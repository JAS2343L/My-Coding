import javax.swing.*;
import java.awt.event.*;
public class GUI2 {
    static int atakk = 0;
    public static void main(String[] args) {
        
        JFrame motu = new JFrame("hello");
        JButton chotu = new JButton("MAT MAARNA MUJHE!!");
        JButton hello = new JButton("Hello");

        chotu.setBounds(193,300,200,40);
        chotu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                atakk++; 

                chotu.setText("skull");

                if (atakk >= 10){
                    System.out.println("\n\n\nBASS, MERA BUTTON TOOT GAYA BYE BYE MAI CHALA!!");
                    chotu.setVisible(false);
                }else if (atakk >= 5){
                    System.out.println("\nAUR KITNI BAAR MAREGA BE!!");
                }else{
                    System.out.println("\n AAAA LAGGAYI!");
                }
            }
        });
        
        hello.setBounds(221,200,150,40);
        hello.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                hello.setText("WELCOME");
                System.out.println("Welcome to my Program made by KINGG3418");
            }
        });

        motu.add(hello);
        motu.add(chotu);

        motu.setTitle("MOTUUUU SEEMAR");
        motu.setSize(600, 600);
        motu.setLayout(null);
        motu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        motu.setVisible(true);


    }
}
