package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    public void init() {
        setBackground(Color.orange);
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.drawLine(75,150, 150, 75);
        g.drawLine(225,150, 150, 75);
        g.drawLine(75,150,225,150);
    }


}
