import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());

            long out_ = digit_count(N);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }

    static long digit_count(int N) {

        long result = 0;

        int val = N;
        int vl = 0;
        while (val > 0) {
            val = val / 10;
            vl++;

        }

        long Nu = (N);
        while (vl > 0) {

            long st = (long) Math.pow(10, (double) vl - 1);
            if (vl % 2 != 0) {
                result += (Nu - st + 1) * 2 * vl;

            } else {

                if (vl % 4 == 0) {
                    result += 4 * (Nu - st + 1) * vl;
                } else {
                    result += 3 * (Nu - st + 1) * vl;
                }

            }

            Nu = st - 1;
            vl--;
        }

        System.out.println(result);

        int sum = 0;

        while (result > 0) {

            long digit = result % 10;
            sum = sum + (int) digit;

            result = result / 10;
        }

        result = sum;

        return result;

    }
}
