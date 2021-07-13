package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No1920 {
	
	static int[] a;
	static int[] b;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		int result = 0;
		
		input();
		Arrays.sort(a);
		
		for(int i=0; i<b.length; i++) {
			result = isNum(a,0,a.length-1,b[i]);
			sb.append(result).append("\n");
		}
		System.out.println(sb);
	}

	private static int isNum(int[] a, int left, int right, int b) {
		
		 //
		int result = 0;
		
		while(left <= right) {
			
			int mid = (left+right)/2;
			
			if(a[mid] == b) {
				result = 1;
				break;
			}else if(a[mid] > b) {
				right = mid-1;
			}else {
				left = mid+1;
			}
		}
		return result;
	}

	private static void input() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		//a설정
		a = new int[Integer.parseInt(br.readLine())];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		//b설정
		b = new int[Integer.parseInt(br.readLine())];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<b.length; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
	}
}
