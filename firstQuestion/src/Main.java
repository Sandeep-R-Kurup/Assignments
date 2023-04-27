import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printAllSubarrays(arr);
    }

    private static <K, V> void insert(Map<K, List<V>> hashMap, K key, V value) {

        hashMap.putIfAbsent(key, new ArrayList<>());
        hashMap.get(key).add(value);
    }


    public static void printAllSubarrays(int[] nums) {
        Map<Integer, List<Integer>> hashMap = new HashMap<>();
        insert(hashMap, 0, -1);

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (hashMap.containsKey(sum)) {
                List<Integer> list = hashMap.get(sum);

                for (Integer value : list) {
                    System.out.println("Subarray [" + (value + 1) + "…" +
                            i + "]");
                }
            }
            insert(hashMap, sum, i);
        }
    }
}