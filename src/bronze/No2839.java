package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2839 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int deliverCount = 0;
		int maxCount=0;
		int samKg=0;
		//카운트변수
		
		for(int i=0; num>(5*i); i++) {
			samKg = (num-(5*i))/3;
			if((num-(5*i))%3 == 0) {
				deliverCount = i+samKg;
			}else {
				deliverCount = -1;
			}
			
		}
	}
}
