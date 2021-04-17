package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No4344 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		StringTokenizer st;
		int count = Integer.parseInt(br.readLine());
		int num=0;
		//평균구하기
		for(int i=0; i<count; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int loopNum = Integer.parseInt(st.nextToken());
			double sum = 0;
			double avg = 0;
			int[] arr = new int[loopNum];
			double overScore = 0;
			
			for(int j=0; j<loopNum; j++) {
				num = Integer.parseInt(st.nextToken());
				sum += num;
				arr[j] = num;
			}
			avg = sum/loopNum;
			
			for(int a:arr) {
				if(avg<a) {
					overScore++;
				}
			}
			sb.append(roundDotScd(overScore*100/loopNum)).append("%").append("\n");
		}
		System.out.println(sb);
	}
	private static String roundDotScd(double num) {
		String result = String.format("%.3f", num);
		return result;
	}
}
