package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10952 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int result;
		String num;
		
		while(true) {
			num = br.readLine();
			String[] nums = num.split(" ");
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);

			result = a+b;
			
			if(result==0) break;
			sb.append(result).append("\n");
		}
		System.out.println(sb);

		
		
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		int result;
//		
//		while(true) {
//			StringTokenizer st = new StringTokenizer(br.readLine()," ");
//			int a = Integer.parseInt(st.nextToken());
//			int b = Integer.parseInt(st.nextToken());
//			
//			result = a+b;
//			if(result==0) break;
//			sb.append(result).append("\n");
//		}
//		System.out.println(sb);
	}
}
