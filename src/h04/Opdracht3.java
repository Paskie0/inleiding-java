package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {

    public void init() {
        setBackground(Color.cyan);
    }

    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.drawLine(50, 50,50,350);
        g.drawLine(51,50,51,350);
        g.setColor(Color.red);
        g.fillRect(52,50,200,50);
        g.setColor(Color.white);
        g.fillRect(52,100,200,50);
        g.setColor(Color.blue);
        g.fillRect(52,150,200,50);
    }


}