class Task
{
	public String name;
	public boolean isComplete;

	// Task()
	// {
	// 	name = "Study Java";
	// 	// isComplete = true;
	// }

	Task(String name,boolean isComplete)
	{
		this.name = name;
		this.isComplete = isComplete;
		
	}

	Task(Task obj)
	{
		this.name = obj.name;
		this.isComplete = obj.isComplete;
	}


	public void markAsComplete()
	{
		isComplete = true;
	}

	public void markAsInComplete()
	{
		isComplete = false;
	}
}