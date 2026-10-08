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

    public int getLastSteps() {
        return lastSteps;
    }
}