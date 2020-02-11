class Square implements Shape{
	public void draw(){
		System.out.println("inside Square");
	}
	public static void main(String[] args) {
		Square c1 = new Square();
		c1.draw();
	}
}