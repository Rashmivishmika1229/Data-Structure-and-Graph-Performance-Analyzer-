public class QueueOperations {
    private int[] values = new int[100];
    private int front = 0;
    private int size = 0;

    public boolean enqueue(int value) {
        if (size == values.length) {
            return false;
        }

        int insertIndex = (front + size) % values.length;
        values[insertIndex] = value;
        size++;
        return true;
    }

    public Integer dequeue() {
        if (size == 0) {
            return null;
        }

        int removedValue = values[front];
        front = (front + 1) % values.length;
        size--;
        return removedValue;
    }

    
}