import java.applet.Applet;
import java.awt.*;
public class drawRectCircleApplet extends Applet
{
	public void paint(Graphics g)
  {
    g.drawRect(50, 80, 150, 100);
    g.drawOval(100, 100, 50, 50);
    g.drawLine(200, 200, 300, 200);
  }
}/*
<applet code="drawRectCircleApplet" width="400" height="300"></applet>*/