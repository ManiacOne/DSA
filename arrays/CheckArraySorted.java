public class CheckArraySorted {
    public static void main(String[] args) {
        int[] elements = {};
        boolean result = checkIfArrayIsSorted(elements);
        System.out.println("Is array sorted : " + result);
    }

    public static boolean checkIfArrayIsSorted(int[] arr) {

        if (arr.length == 0)
            return false;
        if (arr.length == 1)
            return true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }
}
