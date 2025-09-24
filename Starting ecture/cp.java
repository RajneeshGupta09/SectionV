// Question 134 leetcode
public class cp {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int pos = -1, curr = 0, total = 0;

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];

            curr += diff;
            total += diff;

            if (curr < 0) {
                curr = 0;
                pos = i;
            }
        }

        if (total >= 0) {
            return pos+1;
        }

        return -1;
    }

    public static void main(String[] args) {


        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,1,5,2};

        int ans = canCompleteCircuit(gas, cost);
        System.out.println(ans);
    }
}
