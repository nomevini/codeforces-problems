import java.io.*;
import java.util.*;

public class WayTooLongWords {
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
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();

        int p = fs.nextInt();

        for (int i = 0; i < p; i++) {
            String word = fs.next();
            if (word.length() > 10) {
                String abbreviation = String.valueOf(word.charAt(0)) +
                        (word.length() - 2) +
                        word.charAt(word.length() - 1);
                System.out.println(abbreviation);
            }else {
                System.out.println(word);
            }
        }
    }
}