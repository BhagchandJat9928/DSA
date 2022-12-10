import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;

public class CharcterQuery {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] S = new String[N];
        for (int i_S = 0; i_S < N; i_S++) {
            S[i_S] = br.readLine();
        }
        int Q = Integer.parseInt(br.readLine().trim());
        int[][] query = new int[Q][3];
        for (int i_query = 0; i_query < Q; i_query++) {
            String[] arr_query = br.readLine().split(" ");
            for (int j_query = 0; j_query < arr_query.length; j_query++) {
                query[i_query][j_query] = Integer.parseInt(arr_query[j_query]);
            }
        }

        int[] out_ = solve(N, S, Q, query);
        System.out.print(out_[0]);
        for (int i_out_ = 1; i_out_ < out_.length; i_out_++) {
            System.out.print(" " + out_[i_out_]);
        }

        wr.close();
        br.close();
    }

    static int[] solve(int N, String[] S, int Q, int[][] query) {
        // Write your code here
        int[] result = { 0 };
        int res=0;
        for (int i = 0; i < Q; i++) {
            int[] val = query[i];
            for (int j = 0; j < Q; j++) {

                switch (val[0]) {
                    case 1:result[res++]=find(S);
                           break;

                    case 2:
                        S[val[2]] = S[val[2]].replace(S[val[2]].substring(val[1], val[1] + 1), "");
                        break;
                        
                    case 3:
                        StringBuilder st = new StringBuilder(S[val[2]]);
                        st.append(String.valueOf(val[1]));
                        S[val[2]] = st.toString();

                }

            }
        }

        return result;

    }

   static int find(String[] S) {
        List<Integer> list = new ArrayList<>();
        int last = 0;
        for (int i = 0; i < S.length; i++) {
            String val = S[i];
            for (int j = 0; j < val.length(); j++) {
                if (j != i && S[j].contains(val.substring(j, j + 1))) {
                    S[j] = S[j].replace(val.substring(j, j + 1), "");
                    if (!list.isEmpty()) {
                        int lastval = list.get(last) + 1;
                        list.add(last++, lastval);

                    } else {
                        list.add(last, 1);
                    }
                }
            }

        }
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i) % 2;
        }
        return result;
    }

}