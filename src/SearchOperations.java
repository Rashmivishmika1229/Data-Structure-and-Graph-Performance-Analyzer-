public class SearchOperations {
    private int lastSteps;

    public int linearSearch(int[] values, int target) {
        lastSteps = 0;

        for (int i = 0; i < values.length; i++) {
            lastSteps++;

            if (values[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public int binarySearch(int[] sortedValues, int target) {
        lastSteps = 0;

        int low = 0;
        int high = sortedValues.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            lastSteps++;

            if (sortedValues[middle] == target) {
                return middle;
            } else if (sortedValues[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return -1;
    }

    public int getLastSteps() {
        return lastSteps;
    }
}