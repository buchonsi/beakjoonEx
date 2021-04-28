package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2775 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int count = Integer.parseInt(br.readLine());
		
		int[][] apart= new int[15][15];
		
		for(int i=0; i<15; i++) {
			apart[i][0]=1;
			apart[0][i]=i+1;
		}
		for(int i=1; i<15; i++) {
			for(int j=1; j<15; j++) {
				apart[i][j]=apart[i][j-1]+apart[i-1][j];
			}
		}
		for(int i=0; i<count; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine())-1;
			sb.append(apart[k][n]).append("\n");
		}
		System.out.println(sb);
	}
}