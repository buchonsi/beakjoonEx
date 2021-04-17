package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		String num = br.readLine();
		int sum=0;
		
		for(int i=0; i<count; i++) {
			sum += num.charAt(i)-48;
		}
		System.out.println(sum);
	}
}
