package forExam;
//비밀번호 맞추기 만들기
import java.util.Arrays;

public class KTest10713 {

	public static void main(String[] args) {
		int result =func(12345678,10,20,250000,10000000,4);
		
		System.out.println(result);
	}

	private static int func(int money, int minratio, int maxratio, int ranksize, int threshold, int months) {
		int assumeMoney = money/100*100;
		int ratio = 0;
		int ratioRange = maxratio - minratio;
		int spendMoney = 0;
		
		for(int m=0; m<months; m++) {
			if(assumeMoney < threshold) {
				ratio = 0;
				
			}else if(assumeMoney >= (threshold+(ratioRange*ranksize))) {
				ratio=maxratio;
				
			}else {
				for(int i=0; i<ratioRange; i++) {
					if((threshold+(i*ranksize))<=assumeMoney && (threshold+((i+1)*ranksize))>assumeMoney) {
						ratio = minratio+i;
						break;
					}
				}
			}
			spendMoney = assumeMoney*ratio/100;
			money = money - spendMoney;
			assumeMoney = money/100*100;
		}
		return money;
	}
	
	

}
