class TaskFinal
{
	public final String name = "Java"; //Constant value we cannot change this value
	public boolean isComplete;


	public static void main(String[] args)
	{
		TaskFinal t1 = new TaskFinal();
		t1.name = "Pytehoddf"; //Error
		System.out.println(t1.name);
	}
}