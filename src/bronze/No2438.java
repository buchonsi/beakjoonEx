package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2438 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int count = Integer.parseInt(br.readLine());
		String sym = "";
		
		for(int i=0; i<count; i++) {
			sym += "*";
			sb.append(sym).append("\n");
		}
		System.out.println(sb);
	}
}
