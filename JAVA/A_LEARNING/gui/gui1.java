//package A_LEARNING.GUI;
import javax.swing.JOptionPane;

public class gui1 {
    public static void main(String[] args){
        String a = JOptionPane.showInputDialog("What Is Your Name ?");
        //JOptionPane.showMessageDialog(null, "Hello "+a);

        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
        //JOptionPane.showMessageDialog(null, "Welcome "+a+". \nYou Are "+b+" Years Old.");

        String c = JOptionPane.showInputDialog("What is your Favourrite Food ?");
        JOptionPane.showMessageDialog(null, "Welcome "+a+". \nYou Are "+b+" Years Old.\nYour Favourite Food IS "+c+".");

        
    }
}
