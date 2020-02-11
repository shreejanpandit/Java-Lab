import java.io.*;
class fileMerge{
	public static void main(String[] args)throws Exception
	 {
		FileReader f1=new FileReader("stringFile.txt");
		FileReader f2=new FileReader("File1.txt");
		FileWriter f = new FileWriter("file.txt");
		PrintWriter p=new PrintWriter(f);
		int i;
		while((i=f1.read())!=-1){
		 System.out.print((char)i); 
		 p.append((char)i);   
		}
		f1.close();
		while((i=f2.read())!=-1){
		 System.out.print((char)i);  
		 p.append((char)i);   

		}
		f2.close();
		p.close();
		f.close();
	}
}