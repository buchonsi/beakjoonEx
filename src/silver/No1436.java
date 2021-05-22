package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int series = Integer.parseInt(br.readLine());
		int seriesChk = 0;
		int num =0;
		boolean check = false;
		while(true) {
			check = Integer.toString(num).contains("666");
			//Integer.toString() >> null값 못받음 (NullPointException) 
			//String.valueOf() >> null 가능  그 외 차이 없음									
			if(check) {										
				seriesChk++;
				check = false;
			}
			if(series==seriesChk) {
				break;
			}
			num++;
		}
		System.out.println(num);
	}
}
