package buchonsin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class No24480 {
    static boolean[] visited;
    static int[] result;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int startPoint = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        visited = new boolean[n+1];
        result = new int[n+1];
        cnt = 1;

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int j = 0; j < m; j++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        for (ArrayList<Integer> arr : graph) {
            arr.sort((o1, o2) -> {
                return o2-o1;
            });
        }

        dfs(graph, startPoint);

        for (int k = 1; k <= n; k++) {
            sb.append(result[k]).append("\n");
        }

        System.out.println(sb);
    }

    private static void dfs(ArrayList<ArrayList<Integer>> graph, int startPoint) {
        visited[startPoint] = true;
        result[startPoint] = cnt++;

        for (int node : graph.get(startPoint)) {
            if(!visited[node]) {
                dfs(graph, node);
            }
        }
    }
}
