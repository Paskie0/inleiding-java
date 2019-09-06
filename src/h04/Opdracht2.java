package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    public void init() {
        setBackground(Color.orange);
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.drawLine(75,150, 150, 75);
        g.drawLine(225,150, 150, 75);
        g.setColor(Color.yellow);
        g.fillRect(75, 150, 150, 150);
        g.setColor(Color.black);
        g.fillRect(100,255,20,45);
        g.setColor(Color.white);
        g.fillOval(103,275,5,5);
        g.setColor(Color.blue);
        g.fillRect(150,250,30,30);
    }


}
