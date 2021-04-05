package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No11022 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int count = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int result = a+b;
			sb.append("Case #").append(i).append(": ")
			.append(a).append(" + ").append(b).append(" = ").append(result)
			.append("\n");
		}
		System.out.println(sb);
		br.close();
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int count = Integer.parseInt(br.readLine());
//		
//		for(int i=0; i<count; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//			int a = Integer.parseInt(st.nextToken());
//			int b = Integer.parseInt(st.nextToken());
//			int result = a+b;
//			bw.write("Case #"+i+": "+a+" + "+b+" = "+result+"\n");
//		}
//		
//		br.close();
//		bw.flush();
//		bw.close();
	}
}

