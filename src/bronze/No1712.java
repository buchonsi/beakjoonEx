package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1712 {

	public static void main(String[] args) throws IOException {
		//입력값받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		//A B C 변수 선언
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		// x > a/(c-b)
		if(c-b>0) {
			int bep = a/(c-b);
			sb.append(bep+1);
		}else {
			sb.append(-1);
		}
		System.out.println(sb);
	}
}
