package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No15649 {
	static StringBuffer sb = new StringBuffer();
	static int[] arr;
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];			//arr[2]
		visit = new boolean[n];		//boolean[4]
		dfs(n,m,0);					//dfs(4,2,0)
		System.out.println(sb);
	}
	
	//깊이탐색
	public static void dfs(int n, int m, int depth) {
		
		
		if(depth==m) {
			for(int a:arr) {
				sb.append(a).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=0; i<n; i++) {		//for(int =0; i<4; i++)	|| 											|| 
			if(!visit[i]) {				//						|| 											||	
				visit[i] = true;		//visit[0]= true		|| 											|| 
				arr[depth] = i+1;		//arr[0] = 1			|| 											|| 
				dfs(n,m,depth+1);		//dfr(4,2,1) >> 		|| 	for(int=0; i<4; i++)					|| 
				visit[i] = false;		//						||  visit[0]=true >> if문 실행x				|| 
										//						||  for(int=0(1); i<4; i++)					|| for(int=0(2); i<4; i++)
			}							//						||	visit[1] = true							|| visit[1] = false >> if문 실행
										//						||	arr[1] = 2								|| visit[1] = true;
		}								//						||	dfs(4,2,2) >> depth == m(리턴) arr{1,2} || arr[1] = 3	**arr[1]이 바뀜
	}									//						||	visit[1] = false >>						|| dfs(4,2,2) depth == m(리턴) arr{1,3}
}										//						||											|| visit[1] 
