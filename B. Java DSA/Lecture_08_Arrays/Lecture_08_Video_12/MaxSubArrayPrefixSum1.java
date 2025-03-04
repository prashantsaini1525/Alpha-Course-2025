//time Complexity for this code is O(n^2)
//space Complexity for this code is O(n)
public class MaxSubArrayPrefixSum1 {
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        
        prefix[0] = numbers[0];
        //calculate the prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i; j < numbers.length; j++) {

                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1]; //1st method

                // currSum = i > 0 ? prefix[j] - prefix[i-1] : prefix[j]; //2nd method

                if (maxSum < currSum) { //1st method
                    maxSum = currSum;
                } 

                // maxSum = Math.max(maxSum, currSum); //2nd method
            }
        }
        System.out.println("Max Sum : " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubarraySum(numbers);
    }
}
