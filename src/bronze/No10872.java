package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10872 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		int result = factorial(input);
		System.out.println(result);
	}
	
	public static int factorial(int n) {
		if(n==0) return 1;
		return n * factorial(n-1);
	}
}
