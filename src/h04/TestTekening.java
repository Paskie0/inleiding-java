package h04;

import java.applet.Applet;
import java.awt.*;

public class TestTekening extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        setBackground(Color.BLACK);
        g.setColor(Color.yellow);
        g.drawRect(20, 20, 100, 50);
        g.fillRect(20, 80, 100, 50);
        g.drawRoundRect(20, 140, 100, 100, 100, 100);
        g.setColor(Color.green);
        g.drawOval(150, 170, 50, 50);
        g.setColor(Color.RED);
        g.fillRoundRect(150, 100, 50, 50, 10, 10);
        g.setColor(Color.yellow);
        g.fillArc(110, -10, 105, 105, 270, 90);
    }


}
