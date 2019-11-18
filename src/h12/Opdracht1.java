package h12;

import java.applet.Applet;
import java.awt.Graphics;

public class Opdracht1 extends Applet {

    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void init() {
        setSize(275, 200+15*numbers.length);
    }

    public void paint(Graphics g) {
        int x = getWidth();
        int y = getHeight();
        double avg = 0.0;

        for (int teller = 0; teller < numbers.length; teller++) {
            g.drawString(""+ numbers[teller], x/2, (y/2-15*numbers.length/2)+15*teller);
            avg += numbers[teller];
        }
        avg /= numbers.length;
        g.drawString("Het gemiddelde is "+ avg, x/2-50, (y/2+15*numbers.length/2)+10);
    }

}
