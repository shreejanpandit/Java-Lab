abstract class shape
{
	abstract public void draw();
	abstract public void paint();
}
abstract class square extends shape{
	public void draw(){
		System.out.println("Drawing square");
	}

}
class circle extends shape{
	public void draw()
	{
		System.out.println("Drawing circle");
	}
	public void paint()
	{
		System.out.println("panting circle");
	}
}
class abstracts
{
	public static void main(String[] args) {
		circle c=new circle();
		c.draw();
		c.paint();
	}
}