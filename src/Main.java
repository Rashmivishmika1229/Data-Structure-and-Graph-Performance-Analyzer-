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
        System.out.println("Thank you for using Data Structure & Graph Analyzer!");
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

