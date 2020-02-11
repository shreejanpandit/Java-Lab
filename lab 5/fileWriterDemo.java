import java.io.*;
class fileWriterDemo
{
	public static void main(String[] args)throws Exception
	{
		FileWriter f = new FileWriter("file.txt");
		f.write("Hey World what's up!");
		f.flush();
		f.close();
	}
}