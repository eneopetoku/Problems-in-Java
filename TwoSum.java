import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int complement = target - x;

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(x, i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initialize the array to store user input
        int[] nums = new int[n];

        // Prompt user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Prompt user to enter the target sum
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        // Create an instance of Solution class
        Solution solution = new Solution();

        // Call the twoSum method to find the indices
        int[] result = solution.twoSum(nums, target);

        // Print the result
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No valid indices found.");
        }

        scanner.close();
    }
}