package h02;

import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class AppletsOfzo extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.white);
    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Pascal ", 150, 150);
        g.setColor(Color.red);
        g.drawString("De Wit", 150, 165);
    }

}
