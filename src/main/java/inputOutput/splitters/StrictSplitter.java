package inputOutput.splitters;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
@Component
public class StrictSplitter implements Splitter {
    public int[] toSplit(Scanner scannedArray) {
        int[] unsortedArray = new int[0];
        String stringArray = scannedArray.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
      //  while (scannedArray.hasNextLine()) {
//
  //          stringArray = stringBuilder.append(scannedArray.nextLine()).toString();

    //    }
        try {

            unsortedArray = Arrays.stream(stringArray
                            .split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        } catch (NumberFormatException e) {
            System.out.println("Введённый массив имеет неправильный формат");
        }
        return unsortedArray;
    }
}
