public class SubArray2 {
    public static void printSubarrays(int numbers[]) {
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i; j < numbers.length; j++) {
                int sum = 0;

                System.out.print("[");
                
                for(int k = i; k <= j; k++) { //print
                    sum += numbers[k];  // Add element to sum
                    System.out.print(numbers[k] + (k == j ? "" : ", ")); //subarrays
                }
                ts++; //total subarrays printed
                
                //track max and min sum values
                maxSum = Math.max(maxSum, sum);
                minSum = Math.min(minSum, sum);

                System.out.println("] -> Sum: " + sum); // Print subarray and its sum
                System.out.println();
            }
            System.out.println("-------------------");
        }
        // Print the total number of subarrays, max sum and min sum
        System.out.println("Total subarrays printed: " + ts); //total subarrays printed: 15
        System.out.println("Maximum sum of subarrays: " + maxSum);
        System.out.println("Minimum sum of subarrays: " + minSum);
        
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}
