package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2231 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());	
		int minNum=Integer.MAX_VALUE;
		
		for(int i= 0; i<num; i++) {
			if(num ==divSum(i)) {
				minNum = i;
				break;
			}else {
				minNum=0;
			}
		}
		System.out.println(minNum);
	}
	static int divSum(int n) {
		int sum = n;	
		while(n!=0) {
			sum += n%10; 
			n = n/10; 
		}
		return sum;
	}
}
