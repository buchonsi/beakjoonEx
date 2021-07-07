package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No14888 {
	static int n;
	static int[] num;
	static int[] operator;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static StringBuffer sb = new StringBuffer();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		//값 넣기
		StringTokenizer st = new StringTokenizer(br.readLine());
		num = new int[n];
		for(int i=0; i<n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		//연산자 입력
		st = new StringTokenizer(br.readLine());
		operator = new int[4];
		for(int i=0; i<4; i++) {
			operator[i] = Integer.parseInt(st.nextToken());
		}
		
		//재귀
		dfs(num[0],1);
		
		//출력
		sb.append(max).append("\n").append(min);
		System.out.println(sb);
		br.close();
	}
	
	static void dfs(int currnetNum, int idx) {
		if(idx == n) {
			max = Math.max(max, currnetNum);
			min = Math.min(min, currnetNum);
			return;
			
		}
		for (int i = 0; i < 4; i++) {

			if (operator[i] > 0) {
				operator[i]--;

				switch (i) {
				case 0:
					dfs(currnetNum + num[idx], idx + 1);
					break;
				case 1:
					dfs(currnetNum - num[idx], idx + 1);
					break;
				case 2:
					dfs(currnetNum * num[idx], idx + 1);
					break;
				case 3:
					dfs(currnetNum / num[idx], idx + 1);
					break;
				}
				operator[i]++;
			}
		}
	}

}
