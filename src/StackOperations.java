public class StackOperations {
    private int[] values = new int[100];
    private int top = -1;
    
    public boolean push(int value) {
        if (top == values.length - 1) {
            return false;
        }

        top++;
        values[top] = value;
        return true;
    }

    public Integer pop() {
        if (top == -1) {
            return null;
        }

        int removedValue = values[top];
        top--;
        return removedValue;
    }
}