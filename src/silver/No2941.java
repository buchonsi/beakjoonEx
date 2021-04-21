package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] croa = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i=0; i<croa.length; i++) {
			if(s.contains(croa[i])) {
				s = s.replace(croa[i], "1");
			}
		}
		System.out.println(s.length());
	}
}
