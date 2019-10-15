package h11;

import java.applet.Applet;
import java.awt.Graphics;

public class Opdracht4 extends Applet {

    public void init() {
        setSize(400, 400);
    }

    public void paint(Graphics g) {
        int x = getWidth();
        int y = getHeight();

        for (int i = 1; i <= 10; i++) {
            g.drawString(i +" × 3 = "+ 3*i, x/2, y/11*i);
        }
    }
}