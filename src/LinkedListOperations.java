public class LinkedListOperations {

    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void insert(int data) {
    Node newNode = new Node(data);

    if (head == null) {
        head = newNode;
        return;
    }

    Node current = head;

    while (current.next != null) {
        current = current.next;
    }

    current.next = newNode;
}
public void display() {
    if (head == null) {
        System.out.println("Linked List is empty.");
        return;
    }

    Node current = head;

    System.out.print("Linked List: ");

    while (current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
    }

    System.out.println("null");
}
public boolean delete(int data) {
    if (head == null) {
        return false;
    }

    if (head.data == data) {
        head = head.next;
        return true;
    }

    Node current = head;

    while (current.next != null && current.next.data != data) {
        current = current.next;
    }

    if (current.next == null) {
        return false;
    }

    current.next = current.next.next;
    return true;
}
public int search(int data) {
    Node current = head;
    int position = 0;

    while (current != null) {
        if (current.data == data) {
            return position;
        }

        current = current.next;
        position++;
    }

    return -1;
}
}