import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 백준2252_줄세우기 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            A.add(new ArrayList<>());
        }

        int indegree[] = new int[N + 1];

        for (int i = 0; i < M; i++) {
            int S = scanner.nextInt();
            int E = scanner.nextInt();
            A.get(S).add(E);
            indegree[E]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            if (indegree[i] == 0)
                queue.offer(i);
        }

        while(!queue.isEmpty()){
            int now = queue.poll();
            System.out.print(now+" ");
            for(int next : A.get(now)){
                indegree[next]--;
                if(indegree[next] ==0){
                    queue.offer(next);
                }
            }
        }
    }
}

