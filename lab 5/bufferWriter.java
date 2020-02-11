import java.io.*;
class bufferWriter{
	public static void main(String[] args)throws Exception
	 {
	 	FileWriter f = new FileWriter("file1.txt");
		f.write("Hey World what's up!");
		BufferedWriter b=new BufferedWriter(f);
		b.newLine();
		b.write("How are you doing.");
		b.flush();
		b.close();
		f.close();
	}
}