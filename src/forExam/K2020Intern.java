package forExam;

public class K2020Intern {
    //{ 1, 2, 3 }
    //{ 4, 5, 6 }
    //{ 7, 8, 9 }
    //{ *(10). 0. #(11) }
    static int[][] padPos = {
            {3,1},{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2},{3,0},{3,2}
    };

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String result = solution(numbers,hand);
        System.out.println(result);
    }

    static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        String answer = "";
        int leftHand = 10;
        int rightHand = 11;
        for (int number : numbers) {
            //1,4,7일때 왼손
            if (number == 1 || number == 4 || number == 7) {
                sb.append("L");
                leftHand = number;
                continue;
            }
            // 3,6,9 일 때 오른손
            if (number == 3 || number == 6 || number == 9) {
                sb.append("R");
                rightHand = number;
                continue;
            }

            int midChk = dist(number, leftHand, rightHand);
            if (midChk == 0) {
                if (hand.equals("right")) {
                    sb.append("R");
                    rightHand = number;
                } else {
                    sb.append("L");
                    leftHand = number;
                }
            } else if (midChk > 0) {
                sb.append("R");
                rightHand = number;
            } else {
                sb.append("L");
                leftHand = number;
            }
        }
        answer = sb.toString();
        return answer;
    }

    private static int dist(int number, int leftHand, int rightHand) {
        int leftDist = Math.abs(padPos[number][0]- padPos[leftHand][0])
                + Math.abs(padPos[number][1] - padPos[leftHand][1]);
        int rightDist = Math.abs(padPos[number][0]- padPos[rightHand][0])
                + Math.abs(padPos[number][1] - padPos[rightHand][1]);

        //양수 : 오른손, 음수 : 왼손, 0: 주손
        return leftDist - rightDist;
    }
}
