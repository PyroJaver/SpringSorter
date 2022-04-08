package inputOutput.splitters;

import java.util.Arrays;

public class NotStrictSplitter implements Splitter{
//"\\s+"
    @Override
    public int[] toSplit(String stringArray) {
        int[] unsortedArray = new int[0];
        try {
            unsortedArray = Arrays.stream(stringArray
                            .split("[^\\d-]+")).filter(number -> number != null)
                       .mapToInt(Integer::parseInt)
                    .toArray();

        } catch (NumberFormatException e) {
            System.out.println("Введённый массив имеет неправильный формат");
        }
        return unsortedArray;
    }
}
