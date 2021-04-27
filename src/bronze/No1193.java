package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int num = Integer.parseInt(br.readLine());
		int minNum = 0;
		int maxNum = 1;
		int addNum = 1;
		int sum=1;
		while(true) {
			if(num>=minNum && num<=maxNum) {
				break;
			}else {
				minNum = maxNum+1;
				addNum++;
				sum += addNum;
				maxNum = maxNum+addNum;
			}
		}
		int a = 1+(sum-num);
		int b = addNum-(sum-num);
		if(addNum%2==0) {
			sb.append(b).append("/").append(a);
		}else {
			sb.append(a).append("/").append(b);
		}
		System.out.println(sb);
	}
}
