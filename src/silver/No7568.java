package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No7568 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int count = Integer.parseInt(br.readLine());
		int grade;
		
		int[][] person = new int[2][count];
		
		for(int i=0; i<count; i++) {
			StringTokenizer  st = new StringTokenizer(br.readLine());
			person[0][i] = Integer.parseInt(st.nextToken());
			person[1][i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<count; i++) {
			grade = 1;
			for(int j=0; j<count; j++) {
				if(i==j) continue;
				if(person[0][i]<person[0][j] && person[1][i]<person[1][j]) {
					grade++;
				}
			}
			sb.append(grade).append(" ");
		}
		System.out.println(sb);
		br.close();
	}
}
