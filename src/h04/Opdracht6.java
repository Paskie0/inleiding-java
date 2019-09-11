package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {

    public void init() {
        setBackground(Color.cyan);
    }

    public void paint(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRoundRect(40,40,120,330,25,25);
        g.setColor(Color.red);
        g.fillOval(50,50,100,100);
        g.setColor(Color.ORANGE);
        g.fillOval(50,155,100,100);
        g.setColor(Color.GREEN);
        g.fillOval(50,260,100,100);


    }


}