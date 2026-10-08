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

    public Integer peek() {
        if (top == -1) {
            return null;
        }

        return values[top];
    }

    public void display() {
        if (top == -1) {
            System.out.println("The stack is empty.");
            return;
        }

        System.out.println("Stack contents (top to bottom):");
        for (int i = top; i >= 0; i--) {
            System.out.println(values[i]);
        }
    }
}