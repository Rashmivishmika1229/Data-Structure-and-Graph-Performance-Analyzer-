public class LinkedListOperations {
    private Node head;
    private int size;

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public int getSize() {
        return size;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > size) {
            return false;
        }

        Node newNode = new Node(value);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node previous = head;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.next;
            }

            newNode.next = previous.next;
            previous.next = newNode;
        }

        size++;
        return true;
    }

    public Integer delete(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        Node removedNode;

        if (index == 0) {
            removedNode = head;
            head = head.next;
        } else {
            Node previous = head;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.next;
            }

            removedNode = previous.next;
            previous.next = removedNode.next;
        }

        size--;
        return removedNode.value;
    }

    public int search(int target) {
        Node current = head;
        int index = 0;

        while (current != null) {
            if (current.value == target) {
                return index;
            }

            current = current.next;
            index++;
        }

        return -1;
    }

    public void display() {
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }

        Node current = head;
        int index = 0;

        while (current != null) {
            System.out.println("Index " + index + ": " + current.value);
            current = current.next;
            index++;
        }
    }
}