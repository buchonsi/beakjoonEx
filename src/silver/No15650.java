package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No15650 {
	
	static int n,m;
	static int[] count;
	static int[] num;
	static StringBuffer sb = new StringBuffer();
	
	public static void main(String[] args) {
		input();
		count = new int[m];
		num = new int[n];
		dfs_func(0,0);
		System.out.println(sb);
	}

	private static void dfs_func(int startNum, int k) {
		if(k==m) {
			for(int n:count) {
				sb.append(n).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=startNum; i<n; i++) {
			if(num[i]==0) {
				count[k] = i+1;
				num[i] = 1;
				dfs_func(i, k+1);
				num[i] = 0;
			}
		}
	}

	private static void input() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
