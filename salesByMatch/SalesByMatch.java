import java.util.*;

public class SalesByMatch {

    /**
     * HackerRank method signature:
     * Complete the 'sockMerchant' function below.
     *
     * @param n  the number of socks in the pile
     * @param ar a list of integers representing the color of each sock
     * @return   the total number of matching pairs of socks
     */
    public static int sockMerchant(int n, List<Integer> ar) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int key : ar) {
          if(map.containsKey(key)){
            map.put(key, map.get(key) + 1);
          }
          else{
            map.put(key,1);
          }
        }

        int pairs = 0;
        for (int val: map.values()) {
            pairs += val / 2;
        }

        return pairs;
    }

    // Main method to test the function locally (for GitHub/IDE)
    public static void main(String[] args) {
        List<Integer> ar = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
        int n = ar.size();

        int result = sockMerchant(n, ar);
        System.out.println("Total pairs: " + result);  // Output: 3
    }
}
