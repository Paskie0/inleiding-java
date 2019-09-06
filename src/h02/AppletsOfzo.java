package h02;

import java.awt.*;
import java.applet.*;

public class AppletsOfzo extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Pascal ", 150, 150);
        g.setColor(Color.red);
        g.drawString("De Wit", 150, 165);
    }

}
