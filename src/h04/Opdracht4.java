package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    public void init() {
        setBackground(Color.black);
    }

    public void paint(Graphics g) {
        // Yellow Lines
        g.setColor(Color.yellow);
        g.drawLine(50,50,50,330);
        g.drawLine(50,330,330,330);
        // White Lines
        g.setColor(Color.WHITE);
        g.drawLine(50,50,330,50);
        g.drawLine( 50,105,330,105);
        g.drawLine(50,160,330,160);
        g.drawLine(50,215,330,215);
        g.drawLine(50,270,330,270);
        // Valerie
        g.setColor(Color.pink);
        g.drawString("Valerie",55,350);
        g.fillRect(50,215,50,115);
        // Jeroen
        g.setColor(Color.green);
        g.drawString("Jeroen",155,350);
        g.fillRect(150,50,50,280);
        // Hans
        g.setColor(Color.cyan);
        g.drawString("Hans",260,350);
        g.fillRect(250,106,50,224);
        // Numbers
        g.setColor(Color.orange);
        g.drawString("0",30,325);
        g.drawString("20",30,265);
        g.drawString("40",30,220);
        g.drawString("60",30,165);
        g.drawString("80",30,110);
        g.drawString("100",25,55);



    }


}