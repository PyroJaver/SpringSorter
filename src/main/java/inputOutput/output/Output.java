package inputOutput.output;

import java.io.FileNotFoundException;

public interface Output {
    void toOutput(int[] array, int count) throws FileNotFoundException;
}
