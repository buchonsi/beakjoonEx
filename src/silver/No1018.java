package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1018 {
	static boolean[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int count = 0;
		int minCount = Integer.MAX_VALUE;
		//배열에 값넣기
		arr = new boolean[n][m];
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<m; j++) {
				if(s.charAt(j)=='B') {
					arr[i][j] = true;
				}else {
					arr[i][j] = false;
				}
			}
		}
		
		//스타트 지점
		for(int i=0; i<n-7; i++) {
			for(int j=0; j<m-7; j++) {
				count = check(i,j);
				minCount = minCount>count?count:minCount;
			}
		}
		System.out.println(minCount);
	}
	
	static int check(int x, int y) {
		int count=0;
		boolean firstWord = arr[x][y];
		
		for(int i=x; i<x+8; i++) {
			for(int j=y; j<y+8; j++) {
				if(arr[i][j] != firstWord) {
					count++;
				}
				firstWord = !firstWord;
			}
			firstWord = !firstWord;
		}
		
//		int reverseCount = 64-count;
//		count = count>reverseCount?reverseCount:count;
		return count;
	}
}
