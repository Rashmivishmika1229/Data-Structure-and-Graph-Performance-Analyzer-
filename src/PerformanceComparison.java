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

            System.out.println("\nSEARCH COMPARISON");
            System.out.println(
                    "Linear Search: index=" + linearIndex
                            + ", comparisons=" + linearSteps
                            + ", time=" + linearTime + " ns");
            System.out.println(
                    "Binary Search: index=" + binaryIndex
                            + ", comparisons=" + binarySteps
                            + ", time=" + binaryTime + " ns");

            System.out.print(
                    "\nStarting graph vertex for BFS and DFS: ");
            int startVertex = Integer.parseInt(input.nextLine());

            startTime = System.nanoTime();
            List<Integer> bfsOrder =
                    graph.breadthFirstTraversal(startVertex);
            long bfsTime = System.nanoTime() - startTime;
            int bfsSteps = graph.getLastSteps();

            startTime = System.nanoTime();
            List<Integer> dfsOrder =
                    graph.depthFirstTraversal(startVertex);
            long dfsTime = System.nanoTime() - startTime;
            int dfsSteps = graph.getLastSteps();

            System.out.println("\nGRAPH TRAVERSAL COMPARISON");
            System.out.println(
                    "BFS: order=" + bfsOrder
                            + ", neighbor checks=" + bfsSteps
                            + ", time=" + bfsTime + " ns");
            System.out.println(
                    "DFS: order=" + dfsOrder
                            + ", neighbor checks=" + dfsSteps
                            + ", time=" + dfsTime + " ns");

            if (bfsOrder.isEmpty()) {
                System.out.println(
                        "No graph traversal occurred. Add vertices and edges "
                                + "first, and enter an existing start vertex.");
            }

            System.out.println(
                    "\nExecution times can vary between runs, especially "
                            + "for small inputs.");

        } catch (NumberFormatException e) {
            System.out.println("Please enter whole numbers.");
        }
    }
}