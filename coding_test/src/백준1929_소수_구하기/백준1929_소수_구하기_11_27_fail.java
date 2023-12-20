package 백준1929_소수_구하기;

import java.io.IOException;
import java.util.Scanner;

public class 백준1929_소수_구하기_11_27_fail {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int []A = new int[N+1];
        for (int i = 2; i <= N; i++) {
            A[i] = i;
        }

        for (int i = 2; i <=Math.sqrt(N); i++) {
            if(A[i]==0) continue;
            for (int j = i+i; j <=N; j=j+i) {
                A[j] = 0;
            }
        }

        for (int i = M; i <= N; i++) {
            if(A[i]!=0)
                System.out.println(A[i]);
        }


    }

}

