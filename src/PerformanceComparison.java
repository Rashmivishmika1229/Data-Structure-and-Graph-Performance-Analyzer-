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