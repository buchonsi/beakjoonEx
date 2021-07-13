package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No9663 {
	static int N;
	static int[] col;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		nQueen(0);
		
	}

	private static void nQueen(int depth) {
		// TODO Auto-generated method stub
		
	}
}
