package z_daily_program;

public class LargestSmallest {

    public static void main(String[] args) {

        int arr[] = { 12, 3, 4, 7, 33, 9 };

        int n = arr.length;

        int largest = arr[0];
        int secondLargest = arr[0];
        int smallest = arr[0];
        int secondSmallest = arr[0];

        for (int i = 1; i < n; i++) {
            int currentValue = arr[i];

            if (currentValue > largest) {
                secondLargest = largest;
                largest = currentValue;
            } else if (currentValue > secondLargest && currentValue != largest) {
                secondLargest = currentValue;
            }

            if (currentValue < smallest) {
                secondSmallest = smallest;
                smallest = currentValue;
            } else if (currentValue < secondSmallest && currentValue != smallest) {
                secondSmallest = currentValue;
            }
        }
        System.out.println("Second Largest :" + secondLargest);
        System.out.println("Second Smallest :" + secondSmallest);

    }

}

