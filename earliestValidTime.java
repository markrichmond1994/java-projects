import java.util.*;

class Solution {
    public String solution(int A, int B, int C, int D, int E, int F) {
        //declarations
        String message;
        message = "NOT POSSIBLE";

        int[] arr = {A, B, C, D, E, F};
        Arrays.sort(arr);
        if (arr[4] < 6) {
            if (10 * arr[0] + arr[1] < 24)
                return "" + arr[0] + arr[1] + ":" + arr[2] + arr[3] + ":" + arr[4] + arr[5];
            else
                return message;
        } else if (arr[3] < 6) {
            if (10 * arr[0] + arr[1] < 24)
                return "" + arr[0] + arr[1] + ":" + arr[2] + arr[4] + ":" + arr[3] + arr[5];
            else
             return message;
        } else if (arr[2] < 6) {
            if (10 * arr[0] + arr[3] < 24)
                return "" + arr[0] + arr[3] + ":" + arr[1] + arr[4] + ":" + arr[2] + arr[5];
            else
             return message;
        }
        return(message);
    }
}
