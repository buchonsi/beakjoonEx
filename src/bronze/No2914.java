package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2914 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int album = Integer.parseInt(st.nextToken());
		int avg = Integer.parseInt(st.nextToken());
		int result = album * (avg-1)+1;
		
		System.out.println(result);
	}
}
