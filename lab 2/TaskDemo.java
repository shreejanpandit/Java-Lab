class TaskDemo
{
	public static void main(String[] args) 
	{
		// Task t1 = new Task();
		Task t2 = new Task("Study in java", true);
		// t1.name = "Study Java";
		// t1.isComplete = false;
		System.out.println("Task name = "+ t2.name);
		System.out.println("isComplete = "+ t2.isComplete);
	}
}