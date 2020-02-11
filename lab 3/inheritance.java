class parent{
public int a;
public void print()
{
	System.out.println("I am parent");
}
}
class child extends parent
{
	int a;
	child(){
		super();
		super.a=5;
	}
	// public void Print()
	// {
	// System.out.println("I am child");
	// }
}
class superchild extends child{
	superchild(){
		super();
	}
}

class inheritance
{
	public static void main(String[] args)
	{
	
		superchild s = new superchild();
		s.print();
		System.out.println(s.a);
	}
}



