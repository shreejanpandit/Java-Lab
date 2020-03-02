import java.applet.Applet;
import java.awt.*;
public class paraApplet extends Applet
{
	public void paint(Graphics g)
	{
		String str=getParameter("msg");
		String str1=getParameter("msg1");
		g.drawString(str,50,50);
		g.drawString(str1,70,70);
	}
}
/*
<applet code="paraApplet.class" width="300" height="300">
<param name="msg" value="Hello gces" >
<param name="msg1" value="How r u" >
</applet>
*/