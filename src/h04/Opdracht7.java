package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawRoundRect(50,50,150,150,25,25);
        g.drawRoundRect(51,51,150,150,25,25);
        g.drawRoundRect(52,52,150,150,25,25);
        g.fillOval(60,60,50,50);
        g.fillOval(145,60,50,50);
        g.fillOval(60,145,50,50);
        g.fillOval(145,145,50,50);


    }


}