public class SecondLargestAndSmallestElementInArray {
    public static void main(String[] args) {
        int[] elements = { 5, 5, 4 };
        findSecondLargestElement(elements);
        findSecondSmallestElement(elements);
    }

    public static void findSecondLargestElement(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            System.out.println("Second Largest : " + -1);
            return;
        }

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest : " + secondLargest);
    }

    public static void findSecondSmallestElement(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            System.out.println("Second Smallest : " + -1);
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest == Integer.MAX_VALUE ? -1 : smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Second Smallest : " + secondSmallest);
    }

}
