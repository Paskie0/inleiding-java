package h04;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        // Lijn
        g.drawLine(10,10,100,10);
        g.drawString("Lijn",45,25);
        // Rechthoek
        g.drawRect(10,30,90,45);
        g.drawString("Rechthoek",25,90);
        // Afgeronde rechthoek
        g.drawRoundRect(10,95,95,45,30,30);
        g.drawString("Afgeronde Rechthoek",5,155);
        // Gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(110,30,90,45);
        g.setColor(Color.black);
        g.drawOval(110,30,90,45);
        g.drawString("Gevulde rechthoek met ovaal",110,90);
        // Gevulde ovaal
        g.setColor(Color.MAGENTA);
        g.fillOval(110,95,90,45);
        g.setColor(Color.BLACK);
        g.drawString("Gevulde ovaal",130,155);
        // Taartpunt met ovaal eromheen
        g.setColor(Color.magenta);
        g.fillArc(220,30,90,45,0,45);
        g.setColor(Color.BLACK);
        g.drawOval(220,30,90,45);
        g.drawString("Taartpunt met ovaal eromheen",200,105);
        // Cirkel
        g.drawOval(220,105,45,45);
        g.drawString("Cirkel",230,170);




    }


}