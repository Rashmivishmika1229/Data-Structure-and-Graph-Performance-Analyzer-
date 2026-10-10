# Data Structure & Graph Performance Analyzer — Group 17

## Introduction

The **Data Structure & Graph Performance Analyzer** is a Java console application developed for the **CIT300 Data Structures and Algorithms Graded Practical Assignment 2**. It demonstrates how common data structures and algorithms can be implemented and used through a menu-driven application.

Users can perform operations on arrays, stacks, queues, linked lists, and graphs. The application also includes linear and binary search, breadth-first search (BFS), depth-first search (DFS), and performance comparisons that report results, operation counts, and measured execution times.

The project was developed collaboratively using GitHub branches, commits, pull requests, and merges. Each member had assigned components, and all members contributed to testing and debugging.

## Features and Data Structures

- **Array operations:** Insert, delete, display, and search for values.
- **Stack operations:** Push, pop, peek, and display values using last-in, first-out (LIFO) order.
- **Queue operations:** Enqueue, dequeue, peek, and display values using first-in, first-out (FIFO) order. The queue uses circular behaviour.
- **Linked list operations:** Insert, delete, display, and search for values.
- **Searching:** Perform linear search or binary search. Binary search requires values to be in ascending order.
- **Graph operations:** Manage vertices and edges in an undirected graph, display the graph, and check reachability.
- **Graph traversal:** Explore the graph using BFS and DFS.
- **Performance comparison:** Compare linear and binary search, and BFS and DFS. Results include the search index or traversal order, operation counts, and measured execution time.
- **Input handling:** Menus and operations handle invalid choices and empty data structures where applicable.
- **Main menu:** Navigate between the application components and choose the option to display results.

> Execution times are measured during a run and can vary with the computer and input size. They are intended as a demonstration, not as a precise benchmark.

## Technologies

- Java
- Java console input and output
- Git and GitHub for version control and collaboration

## Project Structure

The following is an example layout. Make sure the filenames match the actual files in your `src` folder.

```text
DataStructureGraphAnalyzer/
├── src/
│   ├── Main.java
│   ├── ArrayOperations.java
│   ├── StackOperations.java
│   ├── QueueOperations.java
│   ├── LinkedListOperations.java
│   ├── SearchOperations.java
│   ├── Graph.java
│   └── PerformanceComparison.java
└── README.md
```
## Group Members and Individual Contributions

### 1. U. G. Damith — Student ID: `23DA2-0075`

**Assigned responsibility:** Array and linked list components

**Individual contribution:**

- Created the basic array structure and set up how its values are stored and managed.
- Implemented array insertion, including adding a value at the selected position.
- Implemented array deletion and handled shifting remaining values into their correct positions.
- Implemented array display and search operations.
- Created the basic linked-list structure and implemented insertion and deletion of nodes.
- Implemented linked-list display and search, then contributed the changes through GitHub commits and pull requests.

### 2. M. V. B. M. Senavirathna — Student ID: `23DA2-0030`

**Assigned responsibility:** Stack and queue components

**Individual contribution:**

- Created the stack and queue structures.
- Implemented stack push and pop operations.
- Implemented stack peek and display operations.
- Implemented circular queue enqueue and dequeue operations.
- Implemented queue peek and display operations.
- Contributed stack and queue changes through GitHub commits and pull requests.

### 3. K. A. S. N. Kodithuwakku — Student ID: `23DA2-0327`

**Assigned responsibility:** Searching and performance comparison

**Individual contribution:**

- Implemented linear search to check values sequentially and report the matching index.
- Implemented binary search to locate values efficiently in ascending-order input.
- Added input handling for the search comparison, including collecting the values and target to search for.
- Tracked and reported the number of comparisons made by each search algorithm.
- Measured and displayed the execution time for linear and binary search.
- Contributed the search and performance comparison changes through GitHub commits and pull requests.
- Edited the project demonstration video by arranging the recorded sections and applying appropriate edits to produce a clear, well-organized video.

### 4. K. A. R. V. Kodithuwakku — Student ID: `23DA2-0370`

**Assigned responsibility:** Graph component, application integration, and GitHub management

**Individual contribution:**

- Implemented graph vertex and edge management.
- Implemented graph display, BFS, DFS, and reachability functionality.
- Added graph traversal performance measurements to the comparison component.
- Integrated project components into the main application menu.
- Updated menu navigation and added the option to display results.
- Resolved integration and compatibility issues between components.
- Managed repository collaboration, including branches, pull requests, and merges.

### Shared contribution

**All group members:**

- Participated in testing and debugging.
- Checked component behaviour and helped identify and resolve issues during integration.

## Testing

The application was compiled and its menus and operations were exercised. Testing covered normal operations and relevant boundary cases, including empty structures, invalid operations, searching values, and graph traversal from an existing vertex.

## GitHub Collaboration

The project was developed in a shared GitHub repository. Members used individual branches and meaningful commits to develop assigned components. Pull requests were used to review and merge changes into the integrated application.

The repository's commit history, task tracking(issues) and pull requests provide evidence of development and integration work.



## Project Requirements

- Java Development Kit (JDK) installed
- A terminal or Java-compatible IDE, such as Visual Studio Code

Check that Java is available from your terminal:

```powershell
java -version
javac -version
```

## How to Run

Open a terminal in the project folder and compile the Java source files:

```powershell
javac -d out src\*.java
```

Run the application:

```powershell
java -cp out Main
```

If your source files declare a Java `package`, the compile and run commands may need to include that package name.

## Using the Application

1. Start the application using the commands above.
2. Choose a component from the main menu.
3. Follow the prompts to enter values and select operations.
4. For binary search, provide values in ascending order.
5. For graph operations, add vertices and edges before trying traversals or reachability checks.
6. Choose the exit option to close the application.

## Algorithm Notes

- **Linear search:** Checks values one at a time. Worst-case time complexity: `O(n)`.
- **Binary search:** Repeatedly halves the search range in sorted data. Time complexity: `O(log n)`.
- **BFS and DFS:** Visit reachable vertices in a graph. With an adjacency-list representation, time complexity is `O(V + E)`, where `V` is the number of vertices and `E` is the number of edges. Actual complexity depends on the graph representation used by the program.
- **Array insertion and deletion:** May require shifting elements, so they can take `O(n)` time.
- **Stack operations:** Push, pop, and peek are typically `O(1)`.
- **Circular queue operations:** Enqueue and dequeue are typically `O(1)`.
- **Linked list operations:** Insertion, deletion, and search can take `O(n)`, depending on the operation and node position.

The performance comparison reports measured execution times and operation counts for the selected inputs. Small inputs and one-off measurements may not reflect long-run algorithm performance.

