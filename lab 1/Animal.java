class Animal
{
	String color;
	int leg;

	public Animal()
	{
		System.out.println("Dog");
	}

	public void method1()
	{
		
	}
	
}

class Dog extends Animal
{
	
	int weight;	
	public Dog()
	{
		super();
		// super.leg = 2;
		System.out.println("Tommy");
	}	
	public void method2()
	{
	color = "White";
	leg = 4;
	}
	
}

class Details extends Dog
{
	public Details()
	{
		super();
	}
	public void displayDetails()
	{
		weight = 20;
		System.out.println("Weight = "+ weight+" Kg");
		System.out.println("Color = "+color);
		System.out.println("Leg = "+leg);
	}

	public static void main(String[] args)
	{
		Details obj = new Details();
		obj.method1();
		obj.method2();
		obj.displayDetails();
	}
}