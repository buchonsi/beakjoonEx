package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1065 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(check(num));
	}

	private static int check(int num) {
		int count = 0;
		
		if(num<100) {
			for(int i=0; i<num; i++) {
				count++;
			}
		}else if(num<=1000) {
			count = 99;
			for(int i=100; i<=num; i++) {
				int a = i/100 - ((i/10)%10);
				int b = ((i/10)%10) - i%10;
				if(a == b) {
					count++;
				}
			}
		}
		return count;
	}
}
