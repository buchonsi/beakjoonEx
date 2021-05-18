package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cycle = Integer.parseInt(br.readLine());
		
		System.out.println(fibonacci(cycle));
		
	}
	static int fibonacci(int n) {
		
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
}
