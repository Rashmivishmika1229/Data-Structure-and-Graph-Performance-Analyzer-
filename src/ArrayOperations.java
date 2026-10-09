public class ArrayOperations {
    private int[] values = new int[100];
    private int size = 0;

    public boolean insert(int index, int value) {
    if (index < 0 || index > size || size == values.length) {
        return false;
    }

    for (int i = size; i > index; i--) {
        values[i] = values[i - 1];
    }

    values[index] = value;
    size++;
    return true;
}

public void display() {
    if (size == 0) {
        System.out.println("The array is empty.");
        return;
    }

    for (int i = 0; i < size; i++) {
        System.out.println("Index " + i + ": " + values[i]);
    }
}

public int getSize() {
    return size;
}

public Integer delete(int index) {
    if (index < 0 || index >= size) {
        return null;
    }

    int removedValue = values[index];

    for (int i = index; i < size - 1; i++) {
        values[i] = values[i + 1];
    }

    size--;
    return removedValue;
}

public int search(int target) {
    for (int i = 0; i < size; i++) {
        if (values[i] == target) {
            return i;
        }
    }

    return -1;
}
}