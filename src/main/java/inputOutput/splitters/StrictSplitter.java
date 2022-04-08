package inputOutput.splitters;

import java.util.Arrays;
public class StrictSplitter implements Splitter {
    public int[] toSplit(String stringArray) {
        int[] unsortedArray = new int[0];
        String regexp = "\\s+";
        try {
            unsortedArray = Arrays.stream(stringArray
                            .split(regexp))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch (NumberFormatException e) {
            System.out.println("Введённый массив имеет неправильный формат");
        }
        return unsortedArray;
    }
}
