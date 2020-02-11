import java.io.*;
class fileReaderDemo{
	public static void main(String[] args)throws Exception
	 {
		FileReader f1=new FileReader("stringFile.txt");
		FileReader f2=new FileReader("File1.txt");
		int i;
		while((i=f1.read())!=-1){
		 System.out.print((char)i);      
		}

		while((i=f2.read())!=-1){
		 System.out.print((char)i);      
		}
		f1.close();
		f2.close();
	}
}