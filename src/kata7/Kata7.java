package kata7;

import java.awt.*;
import javax.swing.*;
 
public class Kata7 extends JFrame{
    
    public static void main(String[] args) {
        Kata7 app = new Kata7();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    Reloj Cara;
 
    public Kata7() {
    super( "Kata 7" );
    setVisible(true);
    setResizable(false);
        Container content = this.getContentPane();
        content.setLayout(new BorderLayout());
        Cara = new Reloj();
        content.add(Cara, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        this.pack();
        Cara.start();
    }
}
