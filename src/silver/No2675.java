package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2675 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int count = Integer.parseInt(br.readLine());
		
		for(int i=0; i<count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int wlen = Integer.parseInt(st.nextToken());
			String word = st.nextToken();
			
			for(int j=0; j<word.length(); j++) {
				for(int k=0; k<wlen; k++) {
					sb.append(word.charAt(j));
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
