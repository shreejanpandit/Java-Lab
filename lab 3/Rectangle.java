class Rectangle implements Shape{
	public void draw(){
		System.out.println("inside Rectangle");
	}
	public static void main(String[] args) {
		Rectangle c1 = new Rectangle();
		c1.draw();
	}
}