package arrayproblems;
import java.io.*;
public class ioops{
	public static void main(String [] args) throws IOException {
     
    InputStreamReader in=new InputStreamReader(System.in);
	BufferedReader bf= new BufferedReader(in);
	int k=Integer.parseInt(bf.readLine());
	System.out.println(k);
	}
}
