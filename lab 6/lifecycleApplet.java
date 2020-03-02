import java.applet.Applet;
import java.awt.*;
public class lifecycleApplet extends Applet
{
	public void init()
	{
		System.out.println("Initilization");
	}
	public void start()
	{
		System.out.println("Start");
	}
	public void stop()
	{
		System.out.println("Stop");
	}
	public void paint(Graphics g)
	{
		System.out.println("Paint");
	}
	public void destroy()
	{
		System.out.println("Destroy");
	}
}
/*
<applet code="lifecycleApplet.class" width="300" height="300"></applet>
*/