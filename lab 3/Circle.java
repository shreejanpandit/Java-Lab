class Circle implements Shape{
	public void draw(){
		System.out.println("inside Circle");
	}
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.draw();
	}
}