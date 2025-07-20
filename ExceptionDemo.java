import java.util.*;
import java.io.*;
class ExceptionDemo {
	public static void main(String... args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		int ar[];
		ar[0] = 0;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a = Integer.parseInt(br.readLine());
			bw.write(String.valueOf(a));
		}
		catch(InputMismatchException ime) {
			bw.write(ime.getClass()+" "+ime.getMessage());
		}
		 catch(Exception e) {
			bw.write(e.getMessage());
		}
		//int b = sc.nextInt();
		//System.out.println("b: "+b);
		bw.flush();
	}
}