import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
5 5 1
1 4
1 2
2 3
2 4
3 4
 */

public class Main {
    static boolean[] visited;
    static int[] visitCnt;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        //input
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int startNum = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        visited = new boolean[n + 1];
        visitCnt = new int[n+1];
        cnt = 1;

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int j = 1; j <= m; j++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        //sort
        for (ArrayList<Integer> arr : graph) {
            Collections.sort(arr);
        }

        //bfs
        bfs(graph, startNum);

        //output
        for (int k = 1; k <= n; k++) {
            sb.append(visitCnt[k]).append("\n");
        }
        System.out.println(sb);
    }

    private static void bfs(ArrayList<ArrayList<Integer>> graph, int startNum) {
        visited[startNum] = true;
        visitCnt[startNum] = cnt++;

        Queue<Integer> queue = new LinkedList<>();

        queue.add(startNum);
        while (!queue.isEmpty()){
            for(int node : graph.get(queue.poll())){
                if (!visited[node]) {
                    visitCnt[node] = cnt++;
                    visited[node] = true;
                    queue.add(node);
                }
            }
        }
    }
}
