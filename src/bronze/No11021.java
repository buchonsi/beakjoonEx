package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No11021 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String count = br.readLine();
		String num;
		
		for(int i=1; i<=Integer.parseInt(count); i++) {
			st = new StringTokenizer(br.readLine()," ");
			num = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"";
			sb.append("Case #").append(i).append(": ").append(num).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
