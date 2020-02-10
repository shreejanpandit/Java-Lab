class LocalVariable
{
	public void dog()
	{
		if(false) //Within a block
		{
			int leg = 4;
			System.out.println(leg);
		}
		else
		{
			System.out.println("hi");
		}
	}

	public void color()
	{
		// leg = 4;
	}

	public static void main(String[] args)
	{
		LocalVariable obj = new LocalVariable();
		obj.dog();
	}
}