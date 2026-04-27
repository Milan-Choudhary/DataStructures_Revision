//taking faster input for cp preblems to avoid input overheads

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class BufferReader {
    
    // FastReader class for fast input
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) break; // Handles End of File (EOF)
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st != null && st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader in = new FastReader();
        // PrintWriter buffers the output to prevent printing overhead
        PrintWriter out = new PrintWriter(System.out);

        // Example: Reading number of test cases
        /* int t = in.nextInt();
        while (t-- > 0) {
            solve(in, out);
        }
        */

        // Example usage based on your exponentiation problem:
        int n = in.nextInt();
        while (n-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            
            // Do logic...
            long result = 1; // dummy logic
            
            // Use out.println instead of System.out.println
            out.println(result);
        }

        // CRITICAL: You must flush the PrintWriter at the very end
        // Otherwise, nothing will be printed to the console!
        out.flush();
    }
    
    // Optional: Isolate logic in a separate method for cleaner code
    static void solve(FastReader in, PrintWriter out) {
        // Write your per-test-case logic here
    }

}
