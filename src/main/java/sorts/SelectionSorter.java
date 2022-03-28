package sorts;

public class SelectionSorter implements Sorter {
    @Override
    public int[] toSort(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            int temp = array[minInd];
            array[minInd] = array[left];
            array[left] = temp;
        }
        return array;
    }
}
