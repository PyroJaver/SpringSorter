package inputOutput.output;

import inputOutput.output.Output;

public class ConsoleOutput implements Output {

    @Override
    public void toOutput(int[] sortedArray) {
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }
}
