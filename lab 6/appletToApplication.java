public class appletToApplication
{
	int i;
	public appletToApplication()
	{
		i=11;
	}
	public void paint()
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		appletToApplication a=new appletToApplication();
		a.paint();
	}
}