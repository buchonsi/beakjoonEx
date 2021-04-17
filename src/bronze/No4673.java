package bronze;

public class No4673 {
	
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer();
		boolean[] check = new boolean[10001];
		
		for(int i=0; i<10001; i++) {
			int selfNum = selfNum(i);
			
			if(selfNum<10001) {
				check[selfNum] = true;
			}
		}
		for(int i=0;i<10001;i++) {
			if(check[i]==false) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}
	private static int selfNum(int num) {
		int sum = num;
		while(num!=0) {
			sum += num%10;
			num /= 10;
		}
		return sum;
	}
}
