import javax.swing.JOptionPane;

public class guiSimple {
    public static void main(String[] args){
     String name = JOptionPane.showInputDialog("Enter your name");
     JOptionPane.showMessageDialog(null,"Hello "+name);

     int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
     JOptionPane.showMessageDialog(null,"you are "+age+"years old");

     Double height = Double.parseDouble(JOptionPane.showInputDialog("enter heigth"));
     JOptionPane.showMessageDialog(null,"yOU ARE "+height+"cm tall");


    }
}
