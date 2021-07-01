package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No15651 {
	
	static StringBuffer sb = new StringBuffer();
	static int[] selected;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		selected = new int[m+1];	//[0 1 2]
	
		int startNum = 1;
		
		dfsfunc(n,m,startNum);
		System.out.println(sb);
	}
	
	static void dfsfunc(int n, int m ,int a) {	//a==m 1/2
		if(a==m+1) {
			for(int i=1; i<=m; i++) {
				sb.append(selected[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=1; i<=n; i++) {
			selected[a] = i;
			dfsfunc(n,m,(a+1));
			selected[a] = 0;
		}
	}
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		
//		n = Integer.parseInt(st.nextToken());
//		m = Integer.parseInt(st.nextToken());
//		selected = new int[m+1];	//[0 1 2]
//		
//		int startNum = 1;
//		
//		dfsfunc(startNum);
//		System.out.println(sb);
//	}
//	
//	static void dfsfunc(int a) {	//a==m 1/2
//		if(a==m+1) {
//			for(int i=1; i<=m; i++) {
//				sb.append(selected[i]).append(" ");
//			}
//			sb.append("\n");
//			return;
//		}
//		
//		for(int i=1; i<=n; i++) {
//			selected[a] = i;
//			dfsfunc(a+1);
//			selected[a] = 0;
//		}
//	}
}
