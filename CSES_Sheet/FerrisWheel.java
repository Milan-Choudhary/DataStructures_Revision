import java.io.*;
import java.util.*;

public class FerrisWheel {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long x = Long.parseLong(st.nextToken());

        int[] weights = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            weights[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(weights);

        int left = 0, right = n - 1;
        int c = 0;

        while (left <= right) {
            if (weights[left] + weights[right] <= x) {
                left++;
            }
            right--;
            c++;
        }

        System.out.println(c);
    }
}