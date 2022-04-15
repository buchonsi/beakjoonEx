package buchonsin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No1920 {
    static StringBuilder sb = new StringBuilder();
    static int n;
    static int[] numList;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        numList = new int[n];
        for (int i = 0; i < n; i++) {
            numList[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numList);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < m; j++) {
            int checkNum = Integer.parseInt(st.nextToken());
            binarySearch(checkNum);
        }
        System.out.println(sb);
    }

    public static void binarySearch(int checkNum){
        int startIdx = 0;
        int endIdx = n;

        while (startIdx < endIdx) {
            int mid = startIdx + ((endIdx-startIdx)/2);

            if(checkNum == numList[mid]){
                sb.append(1).append("\n");
                return;
            } else if (checkNum > numList[mid]) {
                startIdx = mid + 1;
            } else {
                endIdx = mid - 1;
            }
        }
        sb.append(0).append("\n");
    }
}
