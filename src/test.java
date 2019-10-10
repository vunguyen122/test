import javax.swing.*;
import java.awt.*;

public class test {
    public static void main(String[] args){
    JFrame f = new JFrame(); //creates jframe f
    //        Timer t = new Timer(1000,this);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //this is your screen size

        f.setUndecorated(false); //removes the surrounding border

    ImageIcon image = new ImageIcon("C:\\Users\\vu nguyen\\IdeaProjects\\ForFuture\\src\\fdfe.jpg.jpg"); //imports the image

    JLabel lbl = new JLabel(image); //puts the image into a jlabel

        f.getContentPane().add(lbl); //puts label inside the jframe

        f.setSize(image.getIconWidth(), image.getIconHeight()); //gets h and w of image and sets jframe to the size
    int x = (screenSize.width - f.getSize().width) / 2; //These two lines are the dimensions
    int y = (screenSize.height - f.getSize().height) / 2;//of the center of the screen
        f.dispose();
        f.setLocation(x, y); //sets the location of the jframe
        f.setVisible(true); //makes the jframe visible
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
}
        }

