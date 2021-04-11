package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class No1110 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		Scanner sc = new Scanner(System.in);
//		int count = 0;
//		String oldNum = sc.nextLine();
//		String compNum = oldNum;
//		int sum = 0;
//		String sum2 = "";
//		
//		while(true) {
//			if(oldNum.length()<2 && !oldNum.equals("0")) {
//				oldNum = oldNum+oldNum;
//				count++;
//			}else if(oldNum.length()<2 && oldNum.equals("0")) {
//				count++;
//			}
//			else {
//				int fstNum = oldNum.charAt(0)-48;		//쪼개기
//				int scdNum = oldNum.charAt(1)-48;
//				sum = fstNum + scdNum;					
//				sum2 = sum + "";
//				if(sum2.length()<2 && scdNum !=0) {					//합이 1자리/2자리
//					oldNum = scdNum + sum2;
//				}else if(sum2.length()<2 && scdNum==0){
//					oldNum = "" + (sum2.charAt(0)-48);
//				}
//				else {
//					oldNum = ""+ scdNum + (sum2.charAt(1)-48);
//				}
//				count++;
//			}
//			
//			if(oldNum.equals(compNum)) break;
//		}
//		System.out.println(count);
//		sc.close();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int su = Integer.parseInt(br.readLine());
		int count=0;
		int compSu = su;
		int fstSu;
		int scdSu;
		int sum;
		
		
		do {
			fstSu = su/10;
			scdSu = su%10;
			sum = fstSu + scdSu;
			su = scdSu*10 + sum%10;
			count++;
		} while(su != compSu); 
		
		System.out.println(count);
		
	}

}
