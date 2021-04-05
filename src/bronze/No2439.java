package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2439 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		int count = Integer.parseInt(br.readLine());
//		String sym = "";
//		
//		for(int i=1; i<=count; i++) {
//			for(int j=count-i; j>=1; j--) {
//				String spc = "";
//				spc += " ";
//				sb.append(spc);
//			}
//			sym += "*";
//			sb.append(sym).append("\n");
//		}
//		System.out.println(sb);
		
	        BufferedReader reader = new BufferedReader(
	                new InputStreamReader(System.in));
	        BufferedWriter writer = new BufferedWriter(
	                new OutputStreamWriter(System.out));
	        StringBuilder builder = new StringBuilder();
	        int N = Integer.parseInt(reader.readLine());

	        for (int i = 0; i < N; ++i) {
	            builder.append(" ");
	        }

	        for (int i = 0; i < N; ++i) {
	            builder.replace(N - i - 1, N - i, "*");
	            writer.write(builder.toString());
	            writer.newLine();
	        }

	        reader.close();
	        writer.close();
	}
}
