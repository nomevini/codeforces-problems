import java.io.*;
import java.util.*;

public class Team {
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        int[] nextIntArray() throws IOException {
            String line = br.readLine();
            String[] parts = line.split(" ");

            int[] arr = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            return arr;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();

        int p = fs.nextInt();
        int problemsCount = 0;

        for (int i = 0; i < p; i++){
            int[] votes = fs.nextIntArray();
            int count = 0;
            for (int vote : votes){
                if (vote == 1){
                    count++;
                }
                if (count > 1){
                    problemsCount++;
                    break;
                }
            }
        }
        System.out.println(problemsCount);
    }
}