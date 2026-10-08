import java.util.List;
import java.util.Scanner;

public class PerformanceComparison {
    public static void run(
            Scanner input,
            SearchOperations searches,
            GraphOperations graph) {
        try {
            System.out.println("\nPERFORMANCE COMPARISON");
            System.out.print("How many numbers will you enter? ");
            int count = Integer.parseInt(input.nextLine());

            if (count <= 0 || count > 100) {
                System.out.println("Enter a number from 1 to 100.");
                return;
            }

            int[] values = new int[count];
            System.out.println("Enter the numbers in ascending order.");

            for (int i = 0; i < count; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                values[i] = Integer.parseInt(input.nextLine());

                if (i > 0 && values[i] < values[i - 1]) {
                    System.out.println(
                            "The numbers must be in ascending order.");
                    return;
                }
            }

            System.out.print("Value to search for: ");
            int target = Integer.parseInt(input.nextLine());

            long startTime = System.nanoTime();
            int linearIndex = searches.linearSearch(values, target);
            long linearTime = System.nanoTime() - startTime;
            int linearSteps = searches.getLastSteps();

            startTime = System.nanoTime();
            int binaryIndex = searches.binarySearch(values, target);
            long binaryTime = System.nanoTime() - startTime;
            int binarySteps = searches.getLastSteps();
        }
    }
}