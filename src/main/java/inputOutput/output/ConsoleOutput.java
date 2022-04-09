package inputOutput.output;


public class ConsoleOutput implements Output {

    @Override
    public void toOutput(int[] sortedArray, int count) {
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
            if (i % count == 0 && i != 0){
                System.out.println();
            }
        }
    }
}
