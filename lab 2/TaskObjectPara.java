class TaskObjectPara
{
	public static void main(String[] args) 
	{
		
		Task t1 = new Task("Python",false);
		// t1.name = "Java";
		// t1.isComplete = true;
		Task t2 = new Task(t1);
		
		System.out.println("Task name = "+ t2.name);
		System.out.println("Task isComplete = "+ t2.isComplete);
	}
}
