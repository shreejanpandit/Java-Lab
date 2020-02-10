class StaticVariable
{
	public static int num1 = 1;
	public static int num2 = 2;

	public static void main(String[] args)
	{
		// We can access static variable using className or object
		// Recommendation className
		// InstanceVariable obj = new InstanceVariable();
		// System.out.println(obj.num2 + obj.num1);
		System.out.println(StaticVariable.num2 + StaticVariable.num1);
	}
}