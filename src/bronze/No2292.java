package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2292 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
//		boolean check = true;
//		int count = 1;
//		//등차수열 6n*n + 6n + 6
//		//범위 6(n-1)*(n-1) + 6(n-1) + 6 < x <= 6n*n + 6n + 6
//		
//		if(num==1) check=false;
//		
//		
//		for(int i=0; check==true; i++) {
//			int a = 3*i*i + 3*i + 2;
//			int b = 3*(i+1)*(i+1) + 3*(i+1) + 2;
//			
//			if(num>=a && num<b) {
//				count = i+2;
//				check=false;
//			}
//		}
//		System.out.println(count);
//		//범위값 설정
//		//for 문 돌려서 x가 참이면 카운트+1
//		//n=0이라면 count = 2
//		//x=1d이라면 count=1
//------------------------------------------------------
		int count=1;
		int minNum = 0;
		int maxNum=1;
		
		//count =1
		//start=0, max=1
		while(true) {
			if(num>=minNum && num<=maxNum) {
				break;
			}else {
				minNum = maxNum+1;
				maxNum += 6*count;
				count++;
			}
		}
		System.out.println(count);
		//max+1 < x < max += 6*count
		//count++
		
		
	}
}
