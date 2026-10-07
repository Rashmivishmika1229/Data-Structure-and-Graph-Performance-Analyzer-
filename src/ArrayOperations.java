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
        System.out.println("Array is empty.");
        return;
    }

    System.out.print("Array elements: ");

    for (int i = 0; i < size; i++) {
        System.out.print(values[i] + " ");
    }

    System.out.println();
}
public boolean delete(int index) {
    if (index < 0 || index >= size) {
        return false;
    }

    for (int i = index; i < size - 1; i++) {
        values[i] = values[i + 1];
    }

    size--;

    return true;
}
}
