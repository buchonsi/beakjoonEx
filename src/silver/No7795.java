package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No7795 {
	
	static int[] A;
	static int[] B;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		 
		int n = Integer.parseInt(br.readLine());
	
		for(int i=0; i<n; i++) {
			testCase();
			//출력
		}
	}
	
	static void testCase() throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = new int[Integer.parseInt(st.nextToken())];
		
	}
	
	
}
