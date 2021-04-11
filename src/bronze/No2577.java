package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2577 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		String result = (a*b*c)+"";
		int idx;
		
		for(int i=0; i<result.length(); i++) {
			idx = result.charAt(i)-48;
			arr[idx]++;
		}
		for(int ct : arr) {
			System.out.println(ct);
		}
	}
}
//숫자 하나씩 뽑아내기 (뒤에서부터)
//int sum = a * b * c;
//int[] cnt = new int[10];

//while (sum > 0) {
//    cnt[sum % 10]++;			//맨끝자리 나머지
//    sum /= 10;				//맨끝자리 지우기
//}
