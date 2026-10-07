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
}