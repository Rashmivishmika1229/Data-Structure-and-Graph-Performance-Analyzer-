import java.util.Scanner;

public class Main {
    private static final String BOLD = "\033[1m";
    private static final String RESET = "\033[0m";
    private static final String LINE = "================================================";

    private static void showTitle(String title) {
        System.out.println();
        System.out.println(LINE);
        System.out.println(BOLD + title + RESET);
        System.out.println(LINE);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayOperations array = new ArrayOperations();
        StackOperations stack = new StackOperations();
        QueueOperations queue = new QueueOperations();
        LinkedListOperations linkedList = new LinkedListOperations();
        SearchOperations searches = new SearchOperations();
        GraphOperations graph = new GraphOperations();
        boolean running = true;

        while (running) {
            showTitle("DATA STRUCTURE & GRAPH ANALYZER");

            System.out.println(BOLD + "DATA STRUCTURES" + RESET);
            System.out.println("1. Array Operations");
            System.out.println("2. Stack Operations");
            System.out.println("3. Queue Operations");
            System.out.println("4. Linked List Operations");

            System.out.println("----------------------------------------------");
            System.out.println(BOLD + "SEARCH & GRAPH ALGORITHMS" + RESET);
            System.out.println("5. Searching Operations");
            System.out.println("6. Graph Operations");
            System.out.println("7. Performance Comparison");

            System.out.println("----------------------------------------------");
            System.out.println(BOLD + "GENERAL" + RESET);
            System.out.println("8. Display All Results");
            System.out.println("0. Exit");
            System.out.println("----------------------------------------------");
            System.out.print("Enter your choice: ");

            String choice = input.nextLine();

            if (choice.equals("1")) {
                arrayMenu(input, array);
            } else if (choice.equals("2")) {
                stackMenu(input, stack);
            } else if (choice.equals("3")) {
                queueMenu(input, queue);
            } else if (choice.equals("4")) {
                linkedListMenu(input, linkedList);
            } else if (choice.equals("5")) {
                searchMenu(input, searches);
            } else if (choice.equals("6")) {
                graphMenu(input, graph);
            } else if (choice.equals("7")) {
                PerformanceComparison.run(input, searches, graph);
            } else if (choice.equals("8")) {
                displayAllResults(array, stack, queue, linkedList, graph);
            } else if (choice.equals("0")) {
                running = false;
            } else {
                System.out.println("Invalid choice. Please enter a number from 0 to 8.");
            }
        }

        input.close();
        System.out.println("Goodbye!");
    }

    private static void arrayMenu(Scanner input, ArrayOperations array) {
        boolean inMenu = true;

        while (inMenu) {
            showTitle("ARRAY OPERATIONS");
            System.out.println("1. Insert value");
            System.out.println("2. Delete by index");
            System.out.println("3. Search by value");
            System.out.println("4. Display array");
            System.out.println("0. Return to main menu");
            System.out.println("----------------------------------------------");
            System.out.print("Enter your choice: ");

            String choice = input.nextLine();

            if (choice.equals("1")) {
                System.out.print("Value to insert: ");

                try {
                    int value = Integer.parseInt(input.nextLine());

                    if (array.insert(array.getSize(), value)) {
                        System.out.println("Value inserted.");
                    } else {
                        System.out.println("The array is full.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a whole number.");
                }

            } else if (choice.equals("2")) {
                System.out.print("Index to delete: ");

                try {
                    int index = Integer.parseInt(input.nextLine());
                    Integer removedValue = array.delete(index);

                    if (removedValue == null) {
                        System.out.println("Invalid index or the array is empty.");
                    } else {
                        System.out.println("Deleted value: " + removedValue);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a whole number.");
                }

            } else if (choice.equals("3")) {
                System.out.print("Value to search for: ");

                try {
                    int value = Integer.parseInt(input.nextLine());
                    int index = array.search(value);

                    if (index == -1) {
                        System.out.println("Value not found.");
                    } else {
                        System.out.println("Value found at index " + index + ".");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a whole number.");
                }

            } else if (choice.equals("4")) {
                array.display();
            } else if (choice.equals("0")) {
                inMenu = false;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void stackMenu(Scanner input, StackOperations stack) {
        boolean inMenu = true;

        while (inMenu) {
            showTitle("STACK OPERATIONS");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display stack");
            System.out.println("0. Return to main menu");
            System.out.println("----------------------------------------------");
            System.out.print("Enter your choice: ");

            String choice = input.nextLine();

            if (choice.equals("1")) {
                System.out.print("Value to push: ");

                try {
                    int value = Integer.parseInt(input.nextLine());

                    if (stack.push(value)) {
                        System.out.println("Value pushed onto the stack.");
                    } else {
                        System.out.println("The stack is full.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a whole number.");
                }

            } else if (choice.equals("2")) {
                Integer removedValue = stack.pop();

                if (removedValue == null) {
                    System.out.println("Cannot pop: the stack is empty.");
                } else {
                    System.out.println("Popped value: " + removedValue);
                }

            } else if (choice.equals("3")) {
                Integer topValue = stack.peek();

                if (topValue == null) {
                    System.out.println("Cannot peek: the stack is empty.");
                } else {
                    System.out.println("Top value: " + topValue);
                }

            } else if (choice.equals("4")) {
                stack.display();
            } else if (choice.equals("0")) {
                inMenu = false;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void queueMenu(Scanner input, QueueOperations queue) {
        boolean inMenu = true;

        while (inMenu) {
            showTitle("QUEUE OPERATIONS");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek / Front");
            System.out.println("4. Display queue");
            System.out.println("0. Return to main menu");
            System.out.println("----------------------------------------------");
            System.out.print("Enter your choice: ");

            String choice = input.nextLine();

            if (choice.equals("1")) {
                System.out.print("Value to enqueue: ");

                try {
                    int value = Integer.parseInt(input.nextLine());

                    if (queue.enqueue(value)) {
                        System.out.println("Value added to the rear of the queue.");
                    } else {
                        System.out.println("The queue is full.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a whole number.");
                }

            } else if (choice.equals("2")) {
                Integer removedValue = queue.dequeue();

                if (removedValue == null) {
                    System.out.println("Cannot dequeue: the queue is empty.");
                } else {
                    System.out.println("Dequeued value: " + removedValue);
                }

            } else if (choice.equals("3")) {
                Integer frontValue = queue.peek();

                if (frontValue == null) {
                    System.out.println("Cannot peek: the queue is empty.");
                } else {
                    System.out.println("Front value: " + frontValue);
                }

            } else if (choice.equals("4")) {
                queue.display();
            } else if (choice.equals("0")) {
                inMenu = false;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void linkedListMenu(
            Scanner input, LinkedListOperations linkedList) {
        boolean inMenu = true;

        while (inMenu) {
            showTitle("LINKED LIST OPERATIONS");
            System.out.println("1. Insert at index");
            System.out.println("2. Delete by index");
            System.out.println("3. Search by value");
            System.out.println("4. Display linked list");
            System.out.println("0. Return to main menu");
            System.out.println("----------------------------------------------");
            System.out.print("Enter your choice: ");

            String choice = input.nextLine();

            if (choice.equals("1")) {
                System.out.print("Index to insert at (0 to "
                        + linkedList.getSize() + "): ");

                try {
                    int index = Integer.parseInt(input.nextLine());
                    System.out.print("Value to insert: ");
                    int value = Integer.parseInt(input.nextLine());

                    if (linkedList.insert(index, value)) {
                        System.out.println("Value inserted.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter whole numbers.");
                }

            } else if (choice.equals("2")) {
                System.out.print("Index to delete: ");

                try {
                    int index = Integer.parseInt(input.nextLine());
                    Integer removedValue = linkedList.delete(index);

                    if (removedValue == null) {
                        System.out.println(
                                "Invalid index or the linked list is empty.");
                    } else {
                        System.out.println("Deleted value: " + removedValue);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a whole number.");
                }

            } else if (choice.equals("3")) {
                System.out.print("Value to search for: ");

                try {
                    int value = Integer.parseInt(input.nextLine());
                    int index = linkedList.search(value);

                    if (index == -1) {
                        System.out.println("Value not found.");
                    } else {
                        System.out.println("Value found at index " + index + ".");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a whole number.");
                }

            } else if (choice.equals("4")) {
                linkedList.display();
            } else if (choice.equals("0")) {
                inMenu = false;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void searchMenu(
            Scanner input, SearchOperations searches) {
        try {
            showTitle("SEARCHING OPERATIONS");
            System.out.println("Enter values in ascending order for binary search.");
            System.out.println("----------------------------------------------");

            System.out.print("How many numbers will you enter? ");
            int count = Integer.parseInt(input.nextLine());

            if (count <= 0 || count > 100) {
                System.out.println("Enter a number from 1 to 100.");
                return;
            }

            int[] values = new int[count];

            for (int i = 0; i < count; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                values[i] = Integer.parseInt(input.nextLine());

                if (i > 0 && values[i] < values[i - 1]) {
                    System.out.println("The numbers must be in ascending order.");
                    return;
                }
            }

            System.out.print("Value to search for: ");
            int target = Integer.parseInt(input.nextLine());

            int linearIndex = searches.linearSearch(values, target);
            int linearSteps = searches.getLastSteps();

            int binaryIndex = searches.binarySearch(values, target);
            int binarySteps = searches.getLastSteps();

            System.out.println("\n" + BOLD + "LINEAR SEARCH" + RESET);
            if (linearIndex == -1) {
                System.out.println("Value not found.");
            } else {
                System.out.println("Value found at index " + linearIndex + ".");
            }
            System.out.println("Comparisons: " + linearSteps);

            System.out.println("\n" + BOLD + "BINARY SEARCH" + RESET);
            if (binaryIndex == -1) {
                System.out.println("Value not found.");
            } else {
                System.out.println("Value found at index " + binaryIndex + ".");
            }
            System.out.println("Comparisons: " + binarySteps);

        } catch (NumberFormatException e) {
            System.out.println("Please enter whole numbers.");
        }
    }

    private static void graphMenu(Scanner input, GraphOperations graph) {
        boolean inMenu = true;

        while (inMenu) {
            showTitle("GRAPH OPERATIONS");
            System.out.println("1. Add vertex");
            System.out.println("2. Add edge");
            System.out.println("3. Display graph");
            System.out.println("4. BFS traversal");
            System.out.println("5. DFS traversal");
            System.out.println("6. Search for reachable vertex");
            System.out.println("0. Return to main menu");
            System.out.println("----------------------------------------------");
            System.out.print("Enter your choice: ");

            String choice = input.nextLine();

            try {
                if (choice.equals("1")) {
                    System.out.print("Vertex number to add: ");
                    int vertex = Integer.parseInt(input.nextLine());

                    if (graph.addVertex(vertex)) {
                        System.out.println("Vertex added.");
                    } else {
                        System.out.println("That vertex already exists.");
                    }

                } else if (choice.equals("2")) {
                    System.out.print("First vertex: ");
                    int from = Integer.parseInt(input.nextLine());
                    System.out.print("Second vertex: ");
                    int to = Integer.parseInt(input.nextLine());

                    if (graph.addEdge(from, to)) {
                        System.out.println("Edge added.");
                    } else {
                        System.out.println(
                                "Could not add edge. Make sure both vertices "
                                        + "exist and the edge is not repeated.");
                    }

                } else if (choice.equals("3")) {
                    graph.display();

                } else if (choice.equals("4")) {
                    System.out.print("Starting vertex for BFS: ");
                    int start = Integer.parseInt(input.nextLine());
                    System.out.println(
                            "BFS order: "
                                    + graph.breadthFirstTraversal(start));

                } else if (choice.equals("5")) {
                    System.out.print("Starting vertex for DFS: ");
                    int start = Integer.parseInt(input.nextLine());
                    System.out.println(
                            "DFS order: "
                                    + graph.depthFirstTraversal(start));

                } else if (choice.equals("6")) {
                    System.out.print("Starting vertex: ");
                    int start = Integer.parseInt(input.nextLine());
                    System.out.print("Vertex to search for: ");
                    int target = Integer.parseInt(input.nextLine());

                    if (graph.isReachable(start, target)) {
                        System.out.println(
                                target + " is reachable from " + start + ".");
                    } else {
                        System.out.println(
                                target + " is not reachable from " + start
                                        + " (or a vertex does not exist).");
                    }

                } else if (choice.equals("0")) {
                    inMenu = false;
                } else {
                    System.out.println("Invalid choice. Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter whole numbers.");
            }
        }

    }

    private static void displayAllResults(
            ArrayOperations array,
            StackOperations stack,
            QueueOperations queue,
            LinkedListOperations linkedList,
            GraphOperations graph) {
        showTitle("CURRENT DATA STRUCTURE RESULTS");

        showTitle("ARRAY");
        array.display();

        showTitle("STACK");
        stack.display();

        showTitle("QUEUE");
        queue.display();

        showTitle("LINKED LIST");
        linkedList.display();

        showTitle("GRAPH");
        graph.display();

        System.out.println(
                "\nSearch and performance results are shown when those operations run.");
    }
}