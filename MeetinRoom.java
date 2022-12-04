import java.util.Arrays;
import java.util.Scanner;

public class MeetinRoom {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int test = sc.nextInt();
            while (test-- > 0) {
                int n = sc.nextInt();
                int[] people = new int[n];
                int[] starting = new int[n];
                int[] ending = new int[n];
                 int sum=0;
                for (int i = 0; i < n; i++) {
                    people[i] = sc.nextInt();
                    sum+=people[i];
                }

                for (int i = 0; i < n; i++) {
                    starting[i] = sc.nextInt();
                }
                for (int i = 0; i < n; i++) {
                    ending[i] = sc.nextInt();
                }

                for (int j = 0; j < n - 1; j++) {
                    for (int i = j + 1; i < n; i++) {
                        if (starting[j] > starting[i]) {
                            swap(starting, ending, people, j, i);
                        }
                    }
                }

                int result =MeetinRoompeople(n, people, starting, ending);
                System.out.println(result);
            }
        }
    }

    private static int MeetinRoompeople(int n, int[] people, int[] starting, int[] ending) {
        int result = 0;
        for (int i = n-1; i>0; i--) {
           
            if (ending[i-1] > starting[i]) {
                result+=people[i];
            }
            
        }
        return result;
    }

    private static void swap(int[] starting, int[] ending, int[] people, int start, int end) {
        int[] temp = { starting[start], ending[start], people[start] };
        starting[start] = starting[end];
        ending[start] = ending[end];
        people[start] = people[end];
        starting[end] = temp[0];
        ending[end] = temp[1];
        people[end] = temp[2];
    }
}
