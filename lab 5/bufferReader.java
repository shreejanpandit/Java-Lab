import java.io.*;
class bufferReader{
	public static void main(String[] args)throws Exception {
		FileReader f1=new FileReader("stringFile.txt");
		BufferedReader b1=new BufferedReader(f1);
		int i;
		while((i=b1.read())!=-1){
		 System.out.print((char)i);      
		}
		b1.close();
		f1.close();
	}
}