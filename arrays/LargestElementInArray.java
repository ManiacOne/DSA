public class LargestElementInArray {
    public static void main(String[] args) {
        int[] elements = { 1, 10, 3, 4, 5 };
        int largestElement = findLargestElement(elements);
        System.out.println(largestElement);
    }

    private static int findLargestElement(int[] arr) {
        int largestElement = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestElement) {
                largestElement = arr[i];
            }
        }
        return largestElement;
    }

}
