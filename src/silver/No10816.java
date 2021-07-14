package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No10816 {
	
	static int[] n;
	static int[] m;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		input();
		Arrays.sort(n);
		for(int i=0; i<m.length; i++) {
			midChk(n , 0, n.length-1, m[i]);
		}
		
	}

	private static int midChk(int[] n, int left, int right, int m) {
		int result = 0;
		int mid;
		
		while(left>right) {
			mid = (left+right)/2;
			if(n[mid] == m) {
				result = checkCount(mid);
				break;
			}else if(n[mid] < m){
				left = mid+1;
			}else {
				right = mid-1;
			}
		}
		return result;
	}

	private static int checkCount(int mid) {
		int count = 0;
		
//		if(n[mid])
		
		return count;
		
	}

	private static void input() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//n값 입력, 설정
		n = new int[Integer.parseInt(br.readLine())];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n.length; i++) {
			n[i] = Integer.parseInt(st.nextToken());
		}
		
		//m값 입력, 설정
		m = new int[Integer.parseInt(br.readLine())];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m.length; i++) {
			m[i] = Integer.parseInt(st.nextToken());
		}
		
		br.close();
	}
	
	
}
